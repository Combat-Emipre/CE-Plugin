package com.github.underplayer97.P11C.commands;

import com.github.underplayer97.P11C.Main;
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
			sender.sendMessage("&4The official youtube is: &5https://www.youtube.com/channel/UCnqhHNB_aG58RqkeCxFfA9w/");
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("info.use")) {
		p.sendMessage("&4The official youtube is: &5https://www.youtube.com/channel/UCnqhHNB_aG58RqkeCxFfA9w/");
			
		return true;
	} else {
		p.sendMessage("&4The official youtube is: &5https://www.youtube.com/channel/UCnqhHNB_aG58RqkeCxFfA9w/");
	}
	return false;
		
		
}}
