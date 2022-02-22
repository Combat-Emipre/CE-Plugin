package com.github.underplayer97.CE.commands;

import com.github.underplayer97.CE.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class DiscordCmd implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public DiscordCmd(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("discord").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("TBA");
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("CE.discord")) {
		p.sendMessage("TBA");
			
		return true;
	} else {
		p.sendMessage("TBA");
	}
	return false;
		
		
}}
