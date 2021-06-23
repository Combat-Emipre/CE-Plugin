package com.github.underplayer97.P11C.commands;

import com.github.underplayer97.P11C.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class WebsiteCmd implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public WebsiteCmd(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("website").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("Link to website: https://11c.org/");
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("P11C.Web")) {
		p.sendMessage("Link to website: https://11c.org/");
			
		return true;
	} else {
		p.sendMessage("Link to website: https://11c.org/");
	}
	return false;
		
		
}}
