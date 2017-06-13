package com.sjgm.pro.crick;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class ScoreUtils {

	private static int NO_OF_PLAYER;
	private static Map<String, Object[]> scheduleMap = null;
	private static List<Team> teams = null;

	static {
		NO_OF_PLAYER = 11;
		scheduleMap = new HashMap<>();
		teams = new CopyOnWriteArrayList<>();
	}

	public static List<Team> getAllTeams() {
		Team team1 = new Team("IND", NO_OF_PLAYER, new String[] { "Dhoni",
				"Sachin", "Koholi" }, 0);
		Team team2 = new Team("AUS", NO_OF_PLAYER, new String[] { "Ricky",
				"Gilkhrist", "stack" }, 0);
		Team team3 = new Team("WID", NO_OF_PLAYER, new String[] { "Gayel",
				"Bravo", "sarwan" }, 0);
		Team team4 = new Team("SA", NO_OF_PLAYER, new String[] { "Deviliors",
				"miller", "Plessis" }, 0);
		teams.add(team1);
		teams.add(team2);
		teams.add(team3);
		teams.add(team4);
		return teams;
	}

	public static Map<String, Object[]> getAgenda(String date) {
		List<Team> teams = getAllTeams();
		// List<Team> ownTeam = new ArrayList<>();

		scheduleMap.put("04/14/2017",
				new Object[] { teams.get(0), teams.get(1) });
		scheduleMap.put("04/15/2017",
				new Object[] { teams.get(2), teams.get(3) });
		return scheduleMap;
	}

	public static void addScore(int teamScore, String teamName) {
		List<Team> teams = getAllTeams();
		for (Team team : teams) {
			if (team.getTeamName().equalsIgnoreCase(teamName)) {
				team.setTotalScore(teamScore);
			}
		}

	}

	public static Map<String, Object[]> reScheduleMatch(String date) {
		List<Team> teams = getAllTeams();
		Collections.sort(teams);
		scheduleMap.put(date, new Object[] { teams.get(0), teams.get(1) });
		return scheduleMap;
	}
	/*
	 * 1.First Call all team 
	 * 2.GetAgenda update Score
	 * 3. Next Reschedule Team those who own 
	 * 4.then again update score 
	 * 5.finally to know own team call list.get(0);
	 */
	
}
