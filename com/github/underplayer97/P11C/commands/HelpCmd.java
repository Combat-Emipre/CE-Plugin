package com.github.underplayer97.P11C.commands;

import com.github.underplayer97.P11C.Main;
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
			sender.sendMessage("About: Information of 11C's Plugin"
					+ "Fly: Allow Flight"
					+ "CHelp: Information of 11C's Commands"
					+ "Website: Link to 11C's Official Website"
					+ "Discord: Link to 11C's Official Discord"
					+ "Credits: Who worked on 11C Plugin"
					+ "GMS: Switches your gamemode to survival"
					+ "GMSP: Switches your gamemode to spectator"
					+ "GMC: Switches your gamemode to creative"
					+ "GMAD: Switches your gamemode to adventure");
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("P11C.help")) {
		p.sendMessage("About: Information of 11C's Plugin"
				+ "Fly: Allow Flight"
				+ "CHelp: Information of 11C's Commands"
				+ "Website: Link to 11C's Official Website"
				+ "Discord: Link to 11C's Official Discord"
				+ "Credits: Who worked on 11C Plugin"
				+ "GMS: Switches your gamemode to survival"
				+ "GMSP: Switches your gamemode to spectator"
				+ "GMC: Switches your gamemode to creative"
				+ "GMAD: Switches your gamemode to adventure");
			
		return true;
	} else {
		p.sendMessage("About: Information of 11C's Plugin"
				+ "Fly: Allow Flight"
				+ "CHelp: Information of 11C's Commands"
				+ "Website: Link to 11C's Official Website"
				+ "Discord: Link to 11C's Official Discord"
				+ "Credits: Who worked on 11C Plugin"
				+ "GMS: Switches your gamemode to survival"
				+ "GMSP: Switches your gamemode to spectator"
				+ "GMC: Switches your gamemode to creative"
				+ "GMAD: Switches your gamemode to adventure");
	}
	return false;
		
		
}}
