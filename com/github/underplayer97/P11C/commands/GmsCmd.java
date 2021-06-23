package com.github.underplayer97.P11C.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.underplayer97.P11C.Main;
import com.github.underplayer97.P11C.utils.Utils;

public class GmsCmd implements CommandExecutor{
	
	private Main plugin; 
	
	public GmsCmd(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("gms").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {		
		if(!(sender instanceof Player)) {
			sender.sendMessage(Utils.chat(plugin.getConfig().getString("console_error_message")));
			return true;
		}
		
		Player p = (Player) sender;
		
		if (p.hasPermission("P11C.GMS")) {
			 {
				 p.setGameMode(GameMode.SURVIVAL);
				return true;
		}}
				

				
			 else {
				p.sendMessage(Utils.chat(plugin.getConfig().getString("no_perm_error")));
			}
				return false;
	}
	
}
