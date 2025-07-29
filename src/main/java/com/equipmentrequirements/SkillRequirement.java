package com.equipmentrequirements;

import net.runelite.api.Client;
import net.runelite.api.Skill;

public class SkillRequirement implements Requirement
{
    private final Skill skill;
    private final int level;

    public SkillRequirement(Skill skill, int level)
    {
        this.skill = skill;
        this.level = level;
    }

    @Override
    public boolean isMet(Client client)
    {
        return client.getRealSkillLevel(skill) >= level;
    }

    @Override
    public String getMessage()
    {
        return "Requires " + level + " " + skill.getName();
    }
}
