package com.github.underplayer97.CE.commands;

import com.github.underplayer97.Ce.Main;
import com.github.underplayer97.CE.utils.Utils;

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
			sender.sendMessage(Utils.chat(plugin.getConfig().getString("AboutCmd.about")));
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("CE.about")) {
		p.sendMessage(Utils.chat(plugin.getConfig().getString("AboutCmd.about")));
			
		return true;
	} else {
		p.sendMessage(Utils.chat(plugin.getConfig().getString("YoutubeCmd.youtube")));
	}
	return false;
		
		
}}
