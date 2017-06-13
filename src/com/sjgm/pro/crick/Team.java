package com.sjgm.pro.crick;

import java.util.Arrays;

public class Team implements Comparable<Team> {
	private String teamName;
	private int noOfPlayer;
	private String[] players;
	private int totalScore;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(String teamName, int noOfPlayer, String[] players,
			int totalScore) {
		super();
		this.teamName = teamName;
		this.noOfPlayer = noOfPlayer;
		this.players = players;
		this.totalScore = totalScore;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNoOfPlayer() {
		return noOfPlayer;
	}

	public void setNoOfPlayer(int noOfPlayer) {
		this.noOfPlayer = noOfPlayer;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", noOfPlayer=" + noOfPlayer
				+ ", players=" + Arrays.toString(players) + ", totalScore="
				+ totalScore + "]";
	}

	@Override
	public int compareTo(Team team) {
		return this.totalScore - team.totalScore;
	}

}
