package main;

import org.bukkit.plugin.java.JavaPlugin;

public class ClearChat extends JavaPlugin {

	@Override
	public void onEnable() {
		getCommand("clearchat").setExecutor(new CommandClearChat());
	}
}
