package com.equipmentrequirements;
import javax.inject.Singleton;

import lombok.extern.slf4j.Slf4j;

import net.runelite.api.Client;
import net.runelite.api.ItemComposition;
import net.runelite.client.game.ItemManager;
import com.equipmentrequirements.EquipmentRequirementsPlugin;
import net.runelite.client.ui.overlay.WidgetItemOverlay;
import net.runelite.client.util.Text;
import net.runelite.api.widgets.WidgetItem;

import javax.inject.Inject;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.InterfaceID;
import net.runelite.api.Quest;

@Singleton
@Slf4j
public class EquipmentRequirementsOverlay extends WidgetItemOverlay
{
	private final Client client;
	private final EquipmentRequirementsConfig config;
	private final ItemManager itemManager;
	private final EquipmentRequirementsPlugin plugin;

	@Inject
	public EquipmentRequirementsOverlay(
		Client client,
		EquipmentRequirementsConfig config,
		ItemManager itemManager,
		EquipmentRequirementsPlugin plugin
	)
	{
		this.client = client;
		this.config = config;
		this.itemManager = itemManager;
		this.plugin = plugin;
		showOnInventory();
		showOnBank();
		showOnInterfaces(InterfaceID.SHOP, InterfaceID.GRAND_EXCHANGE);
	}

    /**
     * Clamp the tooltip position to ensure the tooltip box stays within the canvas.
     */
    private Point clampTooltipPosition(int x, int y, int boxWidth, int boxHeight)
    {
        int canvasWidth = client.getCanvasWidth();
        int canvasHeight = client.getCanvasHeight();

        if (x + boxWidth > canvasWidth)
        {
            x = canvasWidth - boxWidth - 2;
        }
        if (x < 0)
        {
            x = 2;
        }

        if (y < 0)
        {
            y = 2;
        }
        if (y + boxHeight > canvasHeight)
        {
            y = canvasHeight - boxHeight - 2;
        }

        return new Point(x, y);
    }

	@Override
	public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem item)
	{
		if (item.getWidget() == null)
		{
			return;
		}

		if (client.getWidget(320) != null || client.getWidget(1212) != null || client.getWidget(210) != null)
		{
			return; // Skip overlay if Skill Guide is open
		}

		net.runelite.api.Point mousePos = client.getMouseCanvasPosition();
		Point mouse = new Point(mousePos.getX(), mousePos.getY());

		Rectangle bounds = item.getCanvasBounds();
		int lookupId = itemId;
		ItemComposition comp = itemManager.getItemComposition(itemId);
		if (comp.getNote() != -1) {
		    lookupId = comp.getLinkedNoteId();
		}
		String itemName = Text.removeTags(itemManager.getItemComposition(lookupId).getName());

		List<Requirement> requirements = EquipmentRequirementsData.ITEM_REQUIREMENTS_BY_ID.get(lookupId);
		if (requirements == null || requirements.isEmpty())
		{
			requirements = EquipmentRequirementsData.ITEM_REQUIREMENTS.get(itemName);
			if (requirements == null || requirements.isEmpty())
			{
				return;
			}
		}
		boolean unmet = false;

		// Prepare lines and their met status
		List<String> lines = new ArrayList<>();
		List<Boolean> metStatus = new ArrayList<>();

		for (Requirement req : requirements)
		{
			boolean met = req.isMet(client);
			if (req instanceof QuestRequirement)
			{
			    // Always show quest requirements (no completion check currently)
			    met = false;
			}

			if (!met)
			{
				unmet = true;
			}
			lines.add(req.getMessage());
			metStatus.add(met);
		}

		// Only show icon if there are unmet requirements
		if (!unmet)
		{
			return;
		}

		graphics.setFont(new Font("Runescape UF", Font.PLAIN, 18));
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		FontMetrics fm = graphics.getFontMetrics();
		int textWidth = fm.stringWidth("i");
		int x = bounds.x + bounds.width - textWidth - 2;
		int y = bounds.y + bounds.height - 2;

		// Draw outline
		graphics.setColor(Color.BLACK);
		graphics.drawString("i", x - 1, y);
		graphics.drawString("i", x + 1, y);
		graphics.drawString("i", x, y - 1);
		graphics.drawString("i", x, y + 1);

		// Draw main "i" with color based on unmet status
		Color iconColor = unmet ? new Color(255, 65, 65) : new Color(40, 220, 40);
		graphics.setColor(iconColor);
		graphics.drawString("i", x, y);

		if (item.getCanvasBounds().contains(mouse))
		{
			// Use RuneScape font at size 16 for tooltip for clarity and consistency
			Font tooltipFont = new Font("RuneScape UF", Font.PLAIN, 10);
			graphics.setFont(tooltipFont);
			FontMetrics tooltipFontMetrics = graphics.getFontMetrics();

			int lineHeight = tooltipFontMetrics.getHeight();

			// Calculate max line width
			int maxWidth = 0;
			for (String line : lines)
			{
				int lineWidth = tooltipFontMetrics.stringWidth(line);
				if (lineWidth > maxWidth)
				{
					maxWidth = lineWidth;
				}
			}

			int paddingX = 8;
			int paddingY = 6;
			int boxWidth = maxWidth + 2 * paddingX;
			int boxHeight = lineHeight * lines.size() + 2 * paddingY;

			int tooltipX = bounds.x - paddingX;
			int tooltipY = bounds.y - boxHeight - paddingY;

            Point clamped = clampTooltipPosition(tooltipX, tooltipY, boxWidth, boxHeight);
            tooltipX = clamped.x;
            tooltipY = clamped.y;

			graphics.setColor(new Color(60, 52, 41)); // background
			graphics.fillRect(tooltipX, tooltipY, boxWidth, boxHeight);

			graphics.setColor(new Color(90, 82, 71)); // border
			graphics.drawRect(tooltipX, tooltipY, boxWidth, boxHeight);

			int yOffset = tooltipY + paddingY + tooltipFontMetrics.getAscent();

			for (int i = 0; i < lines.size(); i++)
			{
				String line = lines.get(i);
				boolean met = metStatus.get(i);

				// Draw outline
				graphics.setColor(Color.black);
				graphics.drawString(line, tooltipX + paddingX - 1, yOffset - 1);
				graphics.drawString(line, tooltipX + paddingX + 1, yOffset - 1);
				graphics.drawString(line, tooltipX + paddingX, yOffset - 2);
				graphics.drawString(line, tooltipX + paddingX, yOffset);

				// Draw main text with color based on met status
				graphics.setColor(met ? new Color(0, 220, 0) : new Color(255, 65, 65)); // green if met, red if unmet
				graphics.drawString(line, tooltipX + paddingX, yOffset - 1);

				yOffset += lineHeight;
			}
		}
	}

}