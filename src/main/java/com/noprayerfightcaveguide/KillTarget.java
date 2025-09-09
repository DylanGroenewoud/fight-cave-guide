package com.noprayerfightcaveguide;

public class KillTarget
{
    private final int npcId;
    private final int priority;

    public KillTarget(int npcId)
    {
        this(npcId, 1);
    }

    public KillTarget(int npcId, int priority)
    {
        this.npcId = npcId;
        this.priority = priority;
    }

    public int getNpcId()
    {
        return npcId;
    }

    public int getPriority()
    {
        return priority;
    }
}


