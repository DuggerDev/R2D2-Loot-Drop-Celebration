package com.r2d2Celebration;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class R2D2CelebrationPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(R2D2CelebrationPlugin.class);
		RuneLite.main(args);
	}
}