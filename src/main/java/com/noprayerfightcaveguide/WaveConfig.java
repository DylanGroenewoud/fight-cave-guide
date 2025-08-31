package com.noprayerfightcaveguide;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("wave")
public interface WaveConfig extends Config
{
	@ConfigItem(
			keyName = "waveNumber",
			name = "Wave",
			description = "The current fight cave wave"
	)
	default int waveNumber()
	{
		return 1;
	}

	@ConfigItem(
			keyName = "waveNumber",
			name = "Wave",
			description = "The current fight cave wave"
	)
	void setWaveNumber(int wave);
}
