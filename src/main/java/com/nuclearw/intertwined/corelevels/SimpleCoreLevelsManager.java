package com.nuclearw.intertwined.corelevels;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import com.nuclearw.intertwined.corelevels.api.CoreLevelsManager;

public class SimpleCoreLevelsManager implements CoreLevelsManager {
	private CoreLevels plugin;

	public SimpleCoreLevelsManager(CoreLevels plugin) {
		this.plugin = plugin;
	}

	@Override
	public int getLevel(OfflinePlayer player, String levelName) {
		return getLevel(player.getName(), levelName);
	}

	@Override
	public int getLevel(Player player, String levelName) {
		return getLevel(player.getName(), levelName);
	}

	@Override
	public int getLevel(String name, String levelName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getXp(OfflinePlayer player, String levelName) {
		return getXp(player.getName(), levelName);
	}

	@Override
	public int getXp(Player player, String levelName) {
		return getXp(player.getName(), levelName);
	}

	@Override
	public int getXp(String name, String levelName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int awardLevel(OfflinePlayer player, String levelName) {
		return awardLevels(player.getName(), levelName, 1);
	}

	@Override
	public int awardLevel(Player player, String levelName) {
		return awardLevels(player.getName(), levelName, 1);
	}

	@Override
	public int awardLevel(String name, String levelName) {
		return awardLevels(name, levelName, 1);
	}

	@Override
	public int awardLevels(OfflinePlayer player, String levelName, int levels) {
		return awardLevels(player.getName(), levelName, levels);
	}

	@Override
	public int awardLevels(Player player, String levelName, int levels) {
		return awardLevels(player.getName(), levelName, levels);
	}

	@Override
	public int awardLevels(String name, String levelname, int levels) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int awardXp(OfflinePlayer player, String levelName, int xp) {
		return awardXp(player.getName(), levelName, xp);
	}

	@Override
	public int awardXp(Player player, String levelName, int xp) {
		return awardXp(player.getName(), levelName, xp);
	}

	@Override
	public int awardXp(String name, String levelName, int xp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isInDatabase(OfflinePlayer player) {
		return isInDatabase(player.getName());
	}

	@Override
	public boolean isInDatabase(Player player) {
		return isInDatabase(player.getName());
	}

	@Override
	public boolean isInDatabase(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFromDatabase(OfflinePlayer player) {
		return removeFromDatabase(player.getName());
	}

	@Override
	public boolean removeFromDatabase(Player player) {
		return removeFromDatabase(player.getName());
	}

	@Override
	public boolean removeFromDatabase(String name) {
		// TODO Auto-generated method stub
		return false;
	}
}
