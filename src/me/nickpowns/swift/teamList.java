package me.nickpowns.swift;

import java.util.ArrayList;

public class teamList {
	private ArrayList<team> teamList;
	
	public void addTeam(team t) {
		teamList.add(t);
	}
	
	public void removeTeam(team t) {
		teamList.remove(t);
	}
	
	
}
