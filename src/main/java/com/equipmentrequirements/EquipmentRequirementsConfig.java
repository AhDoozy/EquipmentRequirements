package com.equipmentrequirements;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("equipmentrequirements")
public interface EquipmentRequirementsConfig extends Config
{
	@ConfigItem(
		keyName = "showInBank",
		name = "Show in Bank",
		description = "Show red X overlays for items in the bank"
	)
	default boolean showInBank()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showInGE",
		name = "Show in Grand Exchange",
		description = "Show red X overlays for items in the Grand Exchange"
	)
	default boolean showInGE()
	{
		return true;
	}
}
