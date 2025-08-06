package com.equipmentrequirements;
import net.runelite.client.ui.overlay.OverlayManager;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.CommandExecuted;
import net.runelite.api.events.ClientTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import com.equipmentrequirements.EquipmentRequirementsData;

@Slf4j
@PluginDescriptor(
	name = "Equipment Requirements"
)
public class EquipmentRequirementsPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private EquipmentRequirementsConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private EquipmentRequirementsOverlay overlay;

	@Inject
	private EquipmentRequirementsTooltipOverlay tooltipOverlay;

	private boolean tooltipSetThisFrame = false;

	private net.runelite.api.widgets.WidgetItem lastHoveredItem = null;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Equipment Requirements started!");
		overlayManager.add(overlay);
		overlayManager.add(tooltipOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Equipment Requirements stopped!");
		overlayManager.remove(overlay);
		overlayManager.remove(tooltipOverlay);
	}


	public void reloadRequirements()
	{
		EquipmentRequirementsData.loadFromJson();
		log.info("Equipment requirements reloaded.");
		// Trigger overlay redraw if needed
		overlayManager.remove(overlay);
		overlayManager.add(overlay);
	}

	@Subscribe
	public void onCommandExecuted(CommandExecuted event)
	{
		String command = event.getCommand().toLowerCase();
		if (command.equals("reloadreq"))

		{
			reloadRequirements();
		}
	}

	@Provides
	EquipmentRequirementsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(EquipmentRequirementsConfig.class);
	}
    public EquipmentRequirementsTooltipOverlay getTooltipOverlay()
    {
        return tooltipOverlay;
    }

    public void markTooltipSetThisFrame()
    {
        this.tooltipSetThisFrame = true;
    }

    public void resetTooltipFlag()
    {
        this.tooltipSetThisFrame = false;
    }

    public boolean wasTooltipSetThisFrame()
    {
        return this.tooltipSetThisFrame;
    }

    public void updateHoveredItem(net.runelite.api.widgets.WidgetItem currentItem)
    {
        if (lastHoveredItem != null && currentItem != lastHoveredItem)
        {
            System.out.println("Stopped hovering item: " + lastHoveredItem.getId());
        }

        lastHoveredItem = currentItem;
    }

    @Subscribe
    public void onClientTick(ClientTick tick)
    {
        if (!tooltipSetThisFrame)
        {
            tooltipOverlay.clearHoveredTooltip();
        }
        resetTooltipFlag();
    }
}
