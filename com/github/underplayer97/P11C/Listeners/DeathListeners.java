package com.github.underplayer97.P11C.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.github.underplayer97.P11C.Main;
import com.github.underplayer97.P11C.utils.Utils;

public class DeathListeners implements Listener{
	
	
	@SuppressWarnings({ "unused" })
	private static Main plugin;
	
	@SuppressWarnings({ "static-access" })
	public DeathListeners(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		if (e.getEntity().getKiller() instanceof Player) {
			Player killer = e.getEntity().getKiller();
			Player p = e.getEntity();
			
			killer.sendMessage(Utils.chat("&8[&a*&8] &7You have killed &6" + p.getDisplayName()));
			p.sendMessage(Utils.chat("&8[&c*&8] &7You have been killed by &c" + killer.getDisplayName()));
		}
		
	}

}
