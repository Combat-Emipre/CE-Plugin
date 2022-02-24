package com.github.underplayer97.CE.commands;

import com.github.underplayer97.CE.Main;
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
			sender.sendMessage("Credits: Combat Empire Development team, Combat Empire Java Development team");
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("CE.credits")) {
		p.sendMessage("Credits: Combat Empire Development team, Combat Empire Java Development team");
			
		return true;
	} else {
		p.sendMessage("Credits: Combat Empire Development team, Combat Empire Java Development team");
	}
	return false;
		
		
}}
