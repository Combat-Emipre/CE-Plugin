package com.github.underplayer97.P11C.commands;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.underplayer97.P11C.Main;
import com.github.underplayer97.P11C.utils.Utils;

public class FlyCmd implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private ArrayList<Player> flying_players = new ArrayList<>();
	
	private Main plugin; 
	
	public FlyCmd(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("fly").setExecutor(this);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {		
		if(!(sender instanceof Player)) {
			sender.sendMessage(Utils.chat(plugin.getConfig().getString("console_error_message")));
			return true;
		}
		
		Player p = (Player) sender;
		
		if (p.hasPermission("P11C.fly")) {
			if (flying_players.contains(p)) {
				flying_players.remove(p);
				p.setAllowFlight(false);
				p.sendMessage(Utils.chat(plugin.getConfig().getString("FlyCmd.fly_deactived")));
				
				
			} else if(!flying_players.contains(p)) {
				flying_players.add(p);
				p.setFlying(true);
				p.sendMessage(Utils.chat(plugin.getConfig().getString("FlyCmd.fly_active")));
				
			}} else {
				p.sendMessage(Utils.chat(plugin.getConfig().getString("no_perm_error")));
			}
				return false;
	}
	
}
