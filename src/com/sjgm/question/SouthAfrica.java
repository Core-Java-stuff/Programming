package com.sjgm.question;

public class SouthAfrica extends Thread {

	private ScoreBoard scoreBoard;

	public SouthAfrica(ScoreBoard scoreBoard) {
		this.scoreBoard = scoreBoard;
	}

	@Override
	public void run() {
		scoreBoard.displayScore("SA", 50);
	}
}
