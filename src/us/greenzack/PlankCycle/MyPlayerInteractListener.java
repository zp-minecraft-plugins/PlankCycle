package us.greenzack.PlankCycle;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MyPlayerInteractListener implements Listener{
	public static PlankCycle plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	public MyPlayerInteractListener(PlankCycle instance){
		plugin = instance;
		Bukkit.getServer().getPluginManager().registerEvents(this,instance);
	}
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		Player player = event.getPlayer();
		if (!(event.getAction() == Action.RIGHT_CLICK_BLOCK)){
			return;
		}
		if(player.getItemInHand().getTypeId() == 290){
			if(player.hasPermission("plankcycle.cycle")){
				if (event.getClickedBlock().getTypeId() == 5){
					if (event.getClickedBlock().getData() == 1){
						event.getClickedBlock().setData((byte) 3);
						return;
					}
					if (event.getClickedBlock().getData() == 3){
						event.getClickedBlock().setData((byte) 0);
						return;
					}
					if (event.getClickedBlock().getData() == 0){
						event.getClickedBlock().setData((byte) 2);
						return;
					}
					if (event.getClickedBlock().getData() == 2){
						event.getClickedBlock().setData((byte) 1);
						return;
					}
				}
			}
		}
	}
}