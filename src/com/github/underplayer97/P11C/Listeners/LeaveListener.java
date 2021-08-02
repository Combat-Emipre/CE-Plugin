package com.github.underplayer97.P11C.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.github.underplayer97.P11C.Main;
import com.github.underplayer97.P11C.utils.Utils;

public class LeaveListener implements Listener{
	
	public Main plugin;
	
	public LeaveListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("LeaveListener.leave_event").replace("<player>", p.getDisplayName())));
		 	
		
	}
	
}
