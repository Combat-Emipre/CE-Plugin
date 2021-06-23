package com.github.underplayer97.P11C;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.underplayer97.P11C.Listeners.JoinListener;
import com.github.underplayer97.P11C.commands.AboutCmd;
import com.github.underplayer97.P11C.commands.CreditsCmd;
import com.github.underplayer97.P11C.commands.DiscordCmd;
import com.github.underplayer97.P11C.commands.FlyCmd;
import com.github.underplayer97.P11C.commands.GmadCmd;
import com.github.underplayer97.P11C.commands.GmcCmd;
import com.github.underplayer97.P11C.commands.GmsCmd;
import com.github.underplayer97.P11C.commands.GmspCmd;
import com.github.underplayer97.P11C.commands.WebsiteCmd;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		saveDefaultConfig();
		
		//Commands 
		
		new AboutCmd(this);
		
		new WebsiteCmd(this);
		
		new CreditsCmd(this);
		
		new DiscordCmd(this);
		
		new FlyCmd(this);
		
		new CreditsCmd(this);
		
		//Gamemode
		
		new GmsCmd(this);
		
		new GmcCmd(this);
		
		new GmspCmd(this);
		
		new GmadCmd(this);
		
		//Listeners
		
		new JoinListener(this);
	}

}
