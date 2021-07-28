package com.github.underplayer97.P11C.commands;

import com.github.underplayer97.P11C.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class AboutCmd implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public AboutCmd(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("about").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("Plugin Name: 11C Plugin \r\n"
					+ "Plugin Version: 0.7.1 \r\n"
					+ "Hope you have a fun time! \r\n");
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("P11C.about")) {
		p.sendMessage("Plugin Name: 11C Plugin \r\n"
				+ "Plugin Version: 0.7.1 \r\n"
				+ "Hope you have a fun time! \r\n");
			
		return true;
	} else {
		p.sendMessage("Plugin Name: 11C Plugin \r\n"
				+ "Plugin Version: 0.7.1 \r\n"
				+ "Hope you have a fun time! \r\n");
	}
	return false;
		
		
}}
