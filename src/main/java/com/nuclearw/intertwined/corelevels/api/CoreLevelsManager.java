package com.nuclearw.intertwined.corelevels.api;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public interface CoreLevelsManager {
	public int getLevel(OfflinePlayer player, String levelName);

	public int getLevel(Player player, String levelName);

	public int getLevel(String name, String levelName);

	public int getXp(OfflinePlayer player, String levelName);

	public int getXp(Player player, String levelName);

	public int getXp(String name, String levelName);

	public int awardLevel(OfflinePlayer player, String levelName);

	public int awardLevel(Player player, String levelName);

	public int awardLevel(String name, String levelName);

	public int awardLevels(OfflinePlayer player, String levelName, int levels);

	public int awardLevels(Player player, String levelName, int levels);

	public int awardLevels(String name, String levelname, int levels);

	public int awardXp(OfflinePlayer player, String levelName, int xp);

	public int awardXp(Player player, String levelName, int xp);

	public int awardXp(String name, String levelName, int xp);

	public boolean isInDatabase(OfflinePlayer player);

	public boolean isInDatabase(Player player);

	public boolean isInDatabase(String name);

	public boolean removeFromDatabase(OfflinePlayer player);

	public boolean removeFromDatabase(Player player);

	public boolean removeFromDatabase(String name);

	public int getLevelFromXp(int xp, String levelName);
}
