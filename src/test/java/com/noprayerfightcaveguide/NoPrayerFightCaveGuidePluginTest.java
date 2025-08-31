package com.noprayerfightcaveguide;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class NoPrayerFightCaveGuidePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(NoPrayerFightCaveGuidePlugin.class);
		RuneLite.main(args);
	}
}