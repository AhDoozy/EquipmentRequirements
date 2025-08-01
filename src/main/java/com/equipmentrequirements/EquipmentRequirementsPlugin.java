package com.equipmentrequirements;
import net.runelite.client.ui.overlay.OverlayManager;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.CommandExecuted;
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

	@Override
	protected void startUp() throws Exception
	{
		log.info("Equipment Requirements started!");
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Equipment Requirements stopped!");
		overlayManager.remove(overlay);
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Equipment Requirements plugin loaded!", null);
		}
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
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Equipment requirements reloaded!", null);
		}
	}

	@Provides
	EquipmentRequirementsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(EquipmentRequirementsConfig.class);
	}
}
