package com.equipmentrequirements;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.runelite.api.Client;
import net.runelite.api.Skill;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Requirement
{
	private Skill skill;
	private int level;
	private String message;

	public boolean isMet(Client client)
	{
		return client.getRealSkillLevel(skill) >= level;
	}
}
