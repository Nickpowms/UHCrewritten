package me.nickpowns.swift;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class main {
	private team team1, team2, team3, team4;
	private message Help, joinedTeam;
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		team1 = new team("Red");
		team2 = new team("Blue");
		team3 = new team("Green");		
		team4 = new team("Yellow");
		
		Help = new message("Info", "Help message \n"
									+ "/uhc join [team1, team2, team3, team4] \n"
									+ "");
		
		if (!(sender instanceof Player)) {
			sender.sendMessage(new message("Alert", "This command is for players only!").generateMessage());
			return true;
		}
		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("UHC")) {
			if (args.length == 0) {
				p.sendMessage(Help.generateMessage());
			}
			else if (args.length == 1) {
				if (args[1].contains("join")) {
					p.sendMessage(new message("Info", "/uhc join [team1, team2, team3, team4]").generateMessage());
				}
			}
			else if (args.length == 2) {
				if (args[1].contains("join")) {
					if (args[2].contains("team1")) {
						team1.joinTeam(p);
						p.sendMessage(new message("Info", " you joined team " + team1.getTeamName()).generateMessage());
					}
					else if (args[2].contains("team2")) {
						team2.joinTeam(p);
						p.sendMessage(new message("Info", " you joined team " + team2.getTeamName()).generateMessage());
					}
					else if (args[2].contains("team3")) {
						team3.joinTeam(p);
						p.sendMessage(new message("Info", " you joined team " + team3.getTeamName()).generateMessage());
					}
					else if (args[2].contains("team4")) {
						team4.joinTeam(p);
						p.sendMessage(new message("Info", " you joined team " + team4.getTeamName()).generateMessage());
					}
				}
				
				else if(args[1].contains("leave")) {
					team1.leaveTeam(p);
					team2.leaveTeam(p);
					team3.leaveTeam(p);
					team4.leaveTeam(p);
					p.sendMessage(new message("Info", " you left your current team.").generateMessage());
				}
			}
		}
		return true;
	}
}
