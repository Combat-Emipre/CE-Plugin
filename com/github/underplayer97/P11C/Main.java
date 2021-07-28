package com.github.underplayer97.P11C;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.underplayer97.P11C.Listeners.JoinListener;
import com.github.underplayer97.P11C.Listeners.LeaveListener;
import com.github.underplayer97.P11C.commands.AboutCmd;
import com.github.underplayer97.P11C.commands.CreditsCmd;
import com.github.underplayer97.P11C.commands.DiscordCmd;
import com.github.underplayer97.P11C.commands.FlyCmd;
import com.github.underplayer97.P11C.commands.GmadCmd;
import com.github.underplayer97.P11C.commands.GmcCmd;
import com.github.underplayer97.P11C.commands.GmsCmd;
import com.github.underplayer97.P11C.commands.GmspCmd;
import com.github.underplayer97.P11C.commands.HelpCmd;
import com.github.underplayer97.P11C.commands.WebsiteCmd;
import com.github.underplayer97.P11C.commands.YoutubeCmd;

public class Main extends JavaPlugin implements Listener {
	
	FileConfiguration config = getConfig();
	
	@Override
	public void onEnable() {
		
		Bukkit.broadcastMessage("   _   _    ____     ____    _                   _         "
				              + "  / | / |  / ___|   |  _ \\ | |  _   _    __ _  (_)  _ __   "
				              + "  | | | | | |       | |_) | | | | | | |  / _` | | | | '_ \\ "
				              + "  | | | | | |___    |  __/  | | | |_| | | (_| | | | | | | |"
				              + "  |_| |_| \\____|   |_|     |_| \\__,_| \\__, | |_| |_| |_|"
				              + "                                         |___/             "
				              + "                       ACTIVATED                           ");
		
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
		
		new YoutubeCmd(this);
		
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
