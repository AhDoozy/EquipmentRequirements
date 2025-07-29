package com.equipmentrequirements;

import net.runelite.api.Skill;

import java.util.HashMap;
import java.util.Map;

public class EquipmentRequirementsData
{
	public static final Map<String, Requirement> ITEM_REQUIREMENTS = new HashMap<>();

	static
	{
		ITEM_REQUIREMENTS.put("Bandos", new Requirement(Skill.DEFENCE, 65, "Requires 65 Defence"));
		ITEM_REQUIREMENTS.put("Dragon scimitar", new Requirement(Skill.ATTACK, 65, "Requires 65 Attack"));
		ITEM_REQUIREMENTS.put("Rune defender", new Requirement(Skill.DEFENCE, 40, "Requires 40 Defence"));
	}
}
