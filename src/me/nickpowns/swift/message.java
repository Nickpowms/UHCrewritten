package me.nickpowns.swift;

import org.bukkit.ChatColor;

public class message {
	private String type;
	private String message = ChatColor.GRAY + "[" + ChatColor.RED + "UHC" + ChatColor.GRAY + "] ";
	
	public message(String mType, String mMessage) {
		type = mType;
		if (mType.contains("Alert")) {
			message += ChatColor.RED + mMessage;
		}
		else if (mType.contains("Info")) {
			message += ChatColor.GOLD + mMessage;
		}
		else if (mType.contains("Succesfull")) {
			message += ChatColor.GREEN + mMessage;
		}
		else {
			message += mMessage;
		}
	}
	
	public String generateMessage() {
		return message;
	}
}
