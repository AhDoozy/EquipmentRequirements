package com.equipmentrequirements;

import net.runelite.api.Client;

public interface Requirement
{
    boolean isMet(Client client);

    String getMessage();
}
