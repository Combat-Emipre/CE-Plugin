package com.github.underplayer97.P11C.commands;

import com.github.underplayer97.P11C.Main;
import com.github.underplayer97.P11C.utils.Utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class YoutubeCmd implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public YoutubeCmd(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("youtube").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage(Utils.chat(plugin.getConfig().getString("YoutubeCmd.youtube")));
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("P11C.youtube")) {
		p.sendMessage(Utils.chat(plugin.getConfig().getString("YoutubeCmd.youtube")));
			
		return true;
	} else {
		p.sendMessage(Utils.chat(plugin.getConfig().getString("YoutubeCmd.youtube")));
	}
	return false;
		
		
}}
