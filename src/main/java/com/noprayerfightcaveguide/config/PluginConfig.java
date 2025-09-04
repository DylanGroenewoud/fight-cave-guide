package com.noprayerfightcaveguide.config;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

import java.awt.*;

@ConfigGroup("noprayerfightcaveguide")
public interface PluginConfig extends Config
{
	@ConfigItem(
			keyName = "speedrunMode",
			name = "Speedrun mode",
			description = "Switch to speedrun wave mapping"
	)
	default boolean speedrunMode() { return false; }

	@ConfigItem(
			keyName = "waveNumber",
			name = "Wave",
			description = "The current fight cave wave"
	)
	@Range(
			min = 1,
			max = 63
	)
	default int waveNumber() { return 1; }

	@ConfigItem(
			keyName = "npcOutlineColor",
			name = "NPC Outline Color",
			description = "Color used to highlight NPCs in the kill order overlay"
	)
	default Color npcOutlineColor()
	{
		return new Color(19, 158, 224);
	}
}

