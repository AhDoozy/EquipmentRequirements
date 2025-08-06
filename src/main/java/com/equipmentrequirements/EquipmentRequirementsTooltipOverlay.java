package com.equipmentrequirements;

import net.runelite.api.Client;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.util.List;

@Singleton
public class EquipmentRequirementsTooltipOverlay extends Overlay
{
	private final Client client;
	private final EquipmentRequirementsPlugin plugin;

	private WidgetItem hoveredItem;
	private List<String> hoveredTooltipLines;
	private List<Boolean> hoveredTooltipMetStatus;

	@Inject
	public EquipmentRequirementsTooltipOverlay(Client client, EquipmentRequirementsPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		setLayer(OverlayLayer.ALWAYS_ON_TOP);
		setPosition(OverlayPosition.DYNAMIC);
	}

	public WidgetItem getHoveredItem()
	{
		return hoveredItem;
	}

	public List<String> getHoveredTooltipLines()
	{
		return hoveredTooltipLines;
	}

	public List<Boolean> getHoveredTooltipMetStatus()
	{
		return hoveredTooltipMetStatus;
	}

	public void setHoveredTooltip(WidgetItem item, List<String> lines, List<Boolean> met)
	{
		this.hoveredItem = item;
		this.hoveredTooltipLines = lines;
		this.hoveredTooltipMetStatus = met;
	}

	public void clearHoveredTooltip()
	{
		this.hoveredItem = null;
		this.hoveredTooltipLines = null;
		this.hoveredTooltipMetStatus = null;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		WidgetItem hovered = this.hoveredItem;
		if (hovered == null)
		{
			return null;
		}

		List<String> lines = this.hoveredTooltipLines;
		List<Boolean> metStatus = this.hoveredTooltipMetStatus;
		if (lines == null || lines.isEmpty())
		{
			return null;
		}

		graphics.setFont(new Font("RuneScape UF", Font.PLAIN, 10));
		FontMetrics fm = graphics.getFontMetrics();
		int lineHeight = fm.getHeight();

		int maxWidth = 0;
		for (String line : lines)
		{
			maxWidth = Math.max(maxWidth, fm.stringWidth(line));
		}

		int paddingX = 8;
		int paddingY = 6;
		int boxWidth = maxWidth + 2 * paddingX;
		int boxHeight = lineHeight * lines.size() + 2 * paddingY;

		Point mouse = new Point(client.getMouseCanvasPosition().getX(), client.getMouseCanvasPosition().getY());
		int tooltipX = mouse.x - (boxWidth / 2);
		int tooltipY = mouse.y - (boxHeight / 2) - 25;

		// Clamp to screen
		int canvasWidth = client.getCanvasWidth();
		int canvasHeight = client.getCanvasHeight();
		if (tooltipX + boxWidth > canvasWidth) tooltipX = canvasWidth - boxWidth - 2;
		if (tooltipY + boxHeight > canvasHeight) tooltipY = canvasHeight - boxHeight - 2;

		graphics.setColor(new Color(60, 52, 41));
		graphics.fillRect(tooltipX, tooltipY, boxWidth, boxHeight);

		graphics.setColor(new Color(90, 82, 71));
		graphics.drawRect(tooltipX, tooltipY, boxWidth, boxHeight);

		int yOffset = tooltipY + paddingY + fm.getAscent();
		for (int i = 0; i < lines.size(); i++)
		{
			String line = lines.get(i);
			boolean met = metStatus.get(i);

			// Outline
			graphics.setColor(Color.BLACK);
			graphics.drawString(line, tooltipX + paddingX - 1, yOffset - 1);
			graphics.drawString(line, tooltipX + paddingX + 1, yOffset - 1);
			graphics.drawString(line, tooltipX + paddingX, yOffset - 2);
			graphics.drawString(line, tooltipX + paddingX, yOffset);

			// Text
			graphics.setColor(met ? new Color(0, 220, 0) : new Color(255, 65, 65));
			graphics.drawString(line, tooltipX + paddingX, yOffset - 1);

			yOffset += lineHeight;
		}

		return null;
	}

	public void renderItemOverlay(WidgetItem item, Point mouse, List<String> lines, List<Boolean> metStatus)
	{
		if (item.getCanvasBounds().contains(mouse))
		{
			this.setHoveredTooltip(item, lines, metStatus);
			plugin.markTooltipSetThisFrame();
			plugin.updateHoveredItem(item);
			return;
		}
	}
}
