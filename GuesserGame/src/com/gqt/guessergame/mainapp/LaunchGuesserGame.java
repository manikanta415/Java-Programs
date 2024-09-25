package com.gqt.guessergame.mainapp;

import com.gqt.guessergame.umpire.Umpire;

public class LaunchGuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u = new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayers();
		u.compare();

	}

}
