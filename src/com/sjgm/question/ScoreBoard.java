package com.sjgm.question;

public class ScoreBoard {

	public synchronized void displayScore(String teamName, int over) {
		for (int i = 0; i <= over*2; i++) {
			System.out.println("Current Run by :" + teamName + "-" + i);
		}
	}

}
