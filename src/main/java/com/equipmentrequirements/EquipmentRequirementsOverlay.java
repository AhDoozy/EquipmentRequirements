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
import net.runelite.api.widgets.Widget;

import javax.inject.Inject;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.InterfaceID;
import net.runelite.api.Quest;
import net.runelite.api.events.BeforeRender;
import net.runelite.api.events.ClientTick;
import net.runelite.client.eventbus.Subscribe;

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
		net.runelite.api.Point mousePos = client.getMouseCanvasPosition();
		Point mouse = new Point(mousePos.getX(), mousePos.getY());
		boolean hoveringSomething = false;

		if (item.getWidget() == null)
		{
			return;
		}

		if (client.getWidget(320) != null || client.getWidget(1212) != null || client.getWidget(210) != null)
		{
			return; // Skip overlay if Skill Guide is open
		}

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
			System.out.println("Hovered item: " + item.getId());
			plugin.getTooltipOverlay().renderItemOverlay(item, mouse, lines, metStatus);
			plugin.markTooltipSetThisFrame();
			plugin.updateHoveredItem(item);
			hoveringSomething = true;
		}

		if (!hoveringSomething)
		{
			plugin.updateHoveredItem(null);
		}

	}
    @Subscribe
    public void onBeforeRender(BeforeRender event)
    {
        plugin.resetTooltipFlag();
    }

    @Subscribe
    public void onClientTick(ClientTick event)
    {
        if (!plugin.wasTooltipSetThisFrame())
        {
            plugin.getTooltipOverlay().clearHoveredTooltip();
        }
    }
}