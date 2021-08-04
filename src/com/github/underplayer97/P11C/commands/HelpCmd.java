package com.github.underplayer97.P11C.commands;

import com.github.underplayer97.P11C.Main;
import com.github.underplayer97.P11C.utils.Utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class HelpCmd implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public HelpCmd(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("chelp").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage(Utils.chat(plugin.getConfig().getString("HelpCmd.help")));
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("P11C.help")) {
		p.sendMessage(Utils.chat(plugin.getConfig().getString("HelpCmd.help")));
			
		return true;
	} else {
		p.sendMessage(Utils.chat(plugin.getConfig().getString("HelpCmd.help")));
	}
	return false;
		
		
}}
