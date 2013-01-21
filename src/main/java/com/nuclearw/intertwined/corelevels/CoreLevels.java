package com.nuclearw.intertwined.corelevels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import org.bukkit.plugin.java.JavaPlugin;

import com.avaje.ebean.EbeanServer;
import com.lennardf1989.bukkitex.MyDatabase;
import com.nuclearw.intertwined.corelevels.api.CoreLevelsManager;

public class CoreLevels extends JavaPlugin {
	private static CoreLevelsManager manager;
	private MyDatabase database;

	@Override
	public void onEnable() {
		Config.load(this);

		initDatabase();

		manager = new SimpleCoreLevelsManager(this);

		getLogger().info("Finished loading " + getDescription().getFullName());
	}

	@Override
	public void onDisable() {
		getLogger().info("Finished unloading " + getDescription().getFullName());
	}

	@Override
	public EbeanServer getDatabase() {
		return database.getDatabase();
	}

	public static CoreLevelsManager getManager() {
		return manager;
	}

	private void initDatabase() {
		database = new MyDatabase(this) {
			protected List<Class<?>> getDatabaseClasses() {
				List<Class<?>> list = new ArrayList<Class<?>>();
				list.add(Level.class);
				list.add(User.class);

				return list;
			};
		};

		database.initializeDatabase(driver, url, username, password, isolation, logging, rebuild)
	}
}
