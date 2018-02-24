package us.greenzack.PlankCycle;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class PlankCycle extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onDisable() {
		this.logger.info("PlankCycle Version 0.3 is now disabled");
	}
	public void onEnable() {
		new MyPlayerInteractListener(this);
		this.logger.info("PlankCycle Version 0.3 is now enabled");
	}
}