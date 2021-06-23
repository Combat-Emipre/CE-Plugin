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
		plugin.getCommand("Chelp").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("About: Information of 11C's Plugin\r\n"
					+ "Fly: Allow Flight\r\n"
					+ "CHelp: Information of 11C's Commands\r\n"
					+ "Website: Link to 11C's Official Website\r\n"
					+ "Discord: Link to 11C's Official Website\r\n"
					+ "Credits: Who worked on 11C Plugin \r\n"
					+ "GMS: Switches your gamemode to survival \r\n"
					+ "GMSP: Switches your gamemode to spectator \r\n"
					+ "GMC: Switches your gamemode to creative \r\n"
					+ "GMAD: Switches your gamemode to adventure");
			return true;
		}
			
	
	
	Player p = (Player) sender;
		
	if (p.hasPermission("P11C.Help")) {
		p.sendMessage("About: Information of 11C's Plugin\r\n"
				+ "Fly: Allow Flight\r\n"
				+ "CHelp: Information of 11C's Commands\r\n"
				+ "Website: Link to 11C's Official Website\r\n"
				+ "Discord: Link to 11C's Official Website\r\n"
				+ "Credits: Who worked on 11C Plugin \r\n"
				+ "GMS: Switches your gamemode to survival \r\n"
				+ "GMSP: Switches your gamemode to spectator \r\n"
				+ "GMC: Switches your gamemode to creative \r\n"
				+ "GMAD: Switches your gamemode to adventure");
			
		return true;
	} else {
		p.sendMessage("About: Information of 11C's Plugin\r\n"
				+ "Fly: Allow Flight\r\n"
				+ "CHelp: Information of 11C's Commands\r\n"
				+ "Website: Link to 11C's Official Website\r\n"
				+ "Discord: Link to 11C's Official Website\r\n"
				+ "Credits: Who worked on 11C Plugin \r\n"
				+ "GMS: Switches your gamemode to survival \r\n"
				+ "GMSP: Switches your gamemode to spectator \r\n"
				+ "GMC: Switches your gamemode to creative \r\n"
				+ "GMAD: Switches your gamemode to adventure");
	}
	return false;
		
		
}}
