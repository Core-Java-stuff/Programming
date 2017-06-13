package com.sjgm.question;

public class UpdateScore {
	public static void main(String[] args) {
		ScoreBoard scoreBoard = new ScoreBoard();
		India india = new India(scoreBoard);
		SouthAfrica southAfrica = new SouthAfrica(scoreBoard);
		india.start();
		southAfrica.start();
	}
}
