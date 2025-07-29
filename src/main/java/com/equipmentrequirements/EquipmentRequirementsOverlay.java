package com.equipmentrequirements;
import javax.inject.Singleton;

import lombok.extern.slf4j.Slf4j;

import net.runelite.api.Client;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.WidgetItemOverlay;
import net.runelite.client.util.Text;
import net.runelite.api.widgets.WidgetItem;

import javax.inject.Inject;
import java.awt.*;
import java.util.Map;

@Singleton
@Slf4j
public class EquipmentRequirementsOverlay extends WidgetItemOverlay
{
	private final Client client;
	private final EquipmentRequirementsConfig config;
	private final ItemManager itemManager;

	@Inject
	public EquipmentRequirementsOverlay(Client client, EquipmentRequirementsConfig config, ItemManager itemManager)
	{
		this.client = client;
		this.config = config;
		this.itemManager = itemManager;
		showOnBank();
		showOnInventory();
		showOnInterfaces(); // covers GE
	}

	@Override
	public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem item)
	{
		if (item.getWidget() == null)
		{
			return;
		}

		net.runelite.api.Point mousePos = client.getMouseCanvasPosition();
		Point mouse = new Point(mousePos.getX(), mousePos.getY());

		Rectangle bounds = item.getCanvasBounds();

		String itemName = Text.removeTags(itemManager.getItemComposition(itemId).getName());
		log.debug("Resolved item name: {}", itemName);

		if (!EquipmentRequirementsData.ITEM_REQUIREMENTS.containsKey(itemName))
		{
			return;
		}

		Requirement requirement = EquipmentRequirementsData.ITEM_REQUIREMENTS.get(itemName);

		if (!requirement.isMet(client))
		{
			graphics.setFont(new Font("Arial", Font.BOLD, 22));
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

			// Draw main "i"
			graphics.setColor(Color.RED);
			graphics.drawString("i", x, y);

			if (item.getCanvasBounds().contains(mouse))
			{
				String tooltip = requirement.getMessage();
				Font tooltipFont = new Font("RuneScape Bold", Font.PLAIN, 16);
				graphics.setFont(tooltipFont);
				FontMetrics tooltipFontMetrics = graphics.getFontMetrics();
				int tooltipWidth = tooltipFontMetrics.stringWidth(tooltip);
				int tooltipHeight = tooltipFontMetrics.getHeight();

				int tooltipX = bounds.x + (bounds.width - tooltipWidth) / 2;
				int tooltipY = bounds.y - 4;
				int yOffset = tooltipY - tooltipHeight;

				// Draw OSRS-style tooltip box (solid background with border)
				graphics.setColor(new Color(60, 52, 41)); // dark brown background
				graphics.fillRect(tooltipX - 4, yOffset - 4, tooltipWidth + 8, tooltipHeight + 8);

				graphics.setColor(new Color(90, 82, 71)); // lighter brown border
				graphics.drawRect(tooltipX - 4, yOffset - 4, tooltipWidth + 8, tooltipHeight + 8);

				// Draw yellow text with black border
				graphics.setColor(Color.BLACK);
				graphics.drawString(tooltip, tooltipX - 1, tooltipY - 2);
				graphics.drawString(tooltip, tooltipX + 1, tooltipY - 2);
				graphics.drawString(tooltip, tooltipX, tooltipY - 3);
				graphics.drawString(tooltip, tooltipX, tooltipY - 1);

				graphics.setColor(new Color(255, 255, 0)); // RS yellow
				graphics.drawString(tooltip, tooltipX, tooltipY - 2);
			}
		}
	}
}
