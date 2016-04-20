package me.nickpowns.swift;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class team {
	private int TeamSize = 2;
	private String teamName;
	private ArrayList<String> playersInTeam;
	
	public team(String name) {
		teamName = name;
	}
	
	public void joinTeam(Player p) {
		if (playersInTeam.size() != TeamSize) {
			playersInTeam.add(p.getName());
		}
	}
	
	public void leaveTeam(Player p) {
		playersInTeam.remove(p.getName());
	}
	
	public int getTeamSize() {
		return playersInTeam.size();
	}
	
	public String getTeamName() {
		return teamName;
	}

}
