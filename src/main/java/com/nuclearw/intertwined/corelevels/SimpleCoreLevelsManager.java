package com.nuclearw.intertwined.corelevels;

import com.nuclearw.intertwined.corelevels.api.CoreLevelsManager;

public class SimpleCoreLevelsManager implements CoreLevelsManager {
	private CoreLevels plugin;

	public SimpleCoreLevelsManager(CoreLevels plugin) {
		this.plugin = plugin;
	}
}
