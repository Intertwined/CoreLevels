package com.nuclearw.intertwined.corelevels;

import java.io.File;

public class Config {
	public static String dbDriver, dbURL, dbUsername, dbPassword, dbIsolation;
	public static boolean dbLogging, dbRebuild;

	public static void load(CoreLevels plugin) {
		if(!new File(plugin.getDataFolder() , "config.yml").exists()) {
			plugin.saveDefaultConfig();
		}

		dbDriver = plugin.getConfig().getString("database.driver");
		dbURL = plugin.getConfig().getString("database.url");
		dbUsername = plugin.getConfig().getString("database.username");
		dbPassword = plugin.getConfig().getString("database.password");
		dbIsolation = plugin.getConfig().getString("database.getisolation");

		dbLogging = plugin.getConfig().getBoolean("database.logging");
		dbLogging = plugin.getConfig().getBoolean("database.rebuild");
	}
}
