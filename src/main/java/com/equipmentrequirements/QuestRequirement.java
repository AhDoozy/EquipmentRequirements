package com.equipmentrequirements;

import com.equipmentrequirements.Requirement;
import net.runelite.api.Client;
import com.equipmentrequirements.Quest;

public class QuestRequirement implements Requirement
{
    private final String questName;

    public QuestRequirement(String questName)
    {
        this.questName = questName;
    }

    private int getQuestProgress(Client client)
    {
        Quest q;
        try
        {
            String normalizedName = questName.trim()
                .toUpperCase()
                .replace(" ", "_")
                .replace("'", "")
                .replace("-", "")
                .replace("&", "AND");
            q = Quest.valueOf(normalizedName);
        }
        catch (IllegalArgumentException ex)
        {
            return -1;
        }

        if (q.getVarbit() != null)
        {
            return client.getVarbitValue(q.getVarbit().getId());
        }
        else if (q.getVarPlayer() != null)
        {
            return client.getVarpValue(q.getVarPlayer().getId());
        }
        else
        {
            return -1;
        }
    }

    @Override
    public boolean isMet(Client client)
    {
        return getQuestProgress(client) >= 1;
    }

    @Override
    public String getMessage()
    {
        return "Requires " + questName;
    }

    public String getQuestName()
    {
        return questName;
    }
}
