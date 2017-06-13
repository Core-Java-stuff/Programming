package com.sjgm.question;

public class India extends Thread {

	private ScoreBoard scoreBoard;

	public India(ScoreBoard scoreBoard) {
		this.scoreBoard = scoreBoard;
	}

	@Override
	public void run() {
		scoreBoard.displayScore("IND", 50);
	}
}
