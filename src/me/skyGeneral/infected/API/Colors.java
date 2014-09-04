package me.skyGeneral.infected.API;

import org.bukkit.ChatColor;

public enum Colors {
	RESET("\u001B[0m"),
	BLACK("\u001B[30m"),
	RED("\u001B[31m"),
	YELLOW("\u001B[33m"),
	BLUE("\u001b[34m"),
	PURPLE("\u001b[35m"),
	CYAN("\u001b[36m"),
	GREEN("\u001B[32m"),
	WHITE("\u001B[37m");
	String color;
	private Colors(String color){
		this.color = color;
	}
	public static String colorize(String message){
		return ChatColor.translateAlternateColorCodes('&', message);
	}
	

}
