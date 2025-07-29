package com.equipmentrequirements;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class EquipmentRequirementsTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(EquipmentRequirementsPlugin.class);
		RuneLite.main(args);
	}
}