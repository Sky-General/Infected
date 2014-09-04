package me.skyGeneral.infected;


import java.util.logging.Level;

import me.skyGeneral.infected.listener.ListenerClass;
import net.minecraft.server.v1_7_R4.MinecraftServer;

import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public final String RESET = "\u001B[0m";
	public final String BLACK = "\u001B[30m";
	public final String RED = "\u001B[31m";
	public final String GREEN = "\u001B[32m";
	public final String YELLOW = "\u001B[33m";
	public final String BLUE = "\u001B[34m";
	public final String PURPLE = "\u001B[35m";
	public final String CYAN = "\u001B[36m";
	public final String WHITE = "\u001B[37m";
	public void onEnable(){
		this.getLogger().log(Level.INFO, CYAN + "[Infected] " + YELLOW + "Loading Arenas...." + WHITE);
		
		int v = 1;
		while(v!=5){
			try{
				WorldCreator wc = new WorldCreator("Arena" + v);
				wc.type(WorldType.FLAT);
				
				getServer().createWorld(new WorldCreator("Arena" + v));
				v++;
			} catch(Exception ex){
				break;
			}
		}
		getLogger().log(Level.INFO, CYAN + "[Infected]" + YELLOW + " Arenas loaded!" + WHITE);
		new ListenerClass(this);
	}
}
