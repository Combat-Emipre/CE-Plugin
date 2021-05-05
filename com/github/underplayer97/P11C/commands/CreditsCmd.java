package com.github.underplayer97.P11C.commands;

import com.github.underplayer97.P11C.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CreditsCmd implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public CreditsCmd(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("credits").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("Credits: 11C Development team, 11C Java Development team");
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("info.use")) {
		p.sendMessage("Credits: 11C Development team, 11C Java Development team");
			
		return true;
	} else {
		p.sendMessage("Credits: 11C Development team, 11C Java Development team");
	}
	return false;
		
		
}}
