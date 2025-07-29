package com.equipmentrequirements;

import com.equipmentrequirements.Requirement;
import net.runelite.api.Client;

public class QuestRequirement implements Requirement
{
    private final String questName;

    public QuestRequirement(String questName)
    {
        this.questName = questName;
    }

    @Override
    public boolean isMet(Client client)
    {
        // TODO: Implement actual quest completion check logic here
        // For now, return false to indicate requirement not met
        return false;
    }

    @Override
    public String getMessage()
    {
        return "Requires " + questName;
    }
}
