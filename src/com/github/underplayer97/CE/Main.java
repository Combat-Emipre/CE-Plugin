package com.github.underplayer97.CE;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.underplayer97.CE.Listeners.JoinListener;
import com.github.underplayer97.CE.Listeners.LeaveListener;
import com.github.underplayer97.CE.commands.AboutCmd;
import com.github.underplayer97.CE.commands.CreditsCmd;
import com.github.underplayer97.CE.commands.DiscordCmd;
import com.github.underplayer97.CE.commands.FlyCmd;
import com.github.underplayer97.CE.commands.GmadCmd;
import com.github.underplayer97.CE.commands.GmcCmd;
import com.github.underplayer97.CE.commands.GmsCmd;
import com.github.underplayer97.CE.commands.GmspCmd;
import com.github.underplayer97.CE.commands.HelpCmd;
import com.github.underplayer97.CE.commands.WebsiteCmd;
import com.github.underplayer97.CE.commands.HubCmd;

public class Main extends JavaPlugin implements Listener {
	
	FileConfiguration config = getConfig();
	
	@Override
	public void onEnable() {
		
		this.saveDefaultConfig();
		
		//Config
		
		saveConfig();
		
		getServer().getPluginManager().registerEvents(this, this);
		
		
		
		//Commands 
		
		new AboutCmd(this);
		
		new WebsiteCmd(this);
		
		new CreditsCmd(this);
		
		new DiscordCmd(this);
		
		new FlyCmd(this);
		
		new CreditsCmd(this);
		
		new HelpCmd(this);
		
		new HubCmd(this);
		
		//Gamemode
		
		new GmsCmd(this);
		
		new GmcCmd(this);
		
		new GmspCmd(this);
		
		new GmadCmd(this);
		
		//Listeners
		
		new JoinListener(this);
		
		new LeaveListener(this);
	}
	

}
