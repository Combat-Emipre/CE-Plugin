package com.github.underplayer97.CE.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.underplayer97.CE.Main;
import com.github.underplayer97.CE.utils.Utils;

public class GmspCmd implements CommandExecutor{
	
	private Main plugin; 
	
	public GmspCmd(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("gmsp").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {		
		if(!(sender instanceof Player)) {
			sender.sendMessage(Utils.chat(plugin.getConfig().getString("console_error_message")));
			return true;
		}
		
		Player p = (Player) sender;
		
		if (p.hasPermission("CE.GMSP")) {
			 {
				 p.setGameMode(GameMode.SPECTATOR);
				 sender.sendMessage(Utils.chat(plugin.getConfig().getString("GmSys.sp")));
				return true;
		}}
				

				
			 else {
				p.sendMessage(Utils.chat(plugin.getConfig().getString("no_perm_error")));
			}
				return false;
	}
	
}
