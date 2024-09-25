package com.gqt.guessergame.guesser;

import java.util.Random;

public class Guesser {
	int guesserNumber;
	public int guesserNumber() {
		System.out.println("Guesser kindly guess a number from 1 to 10");
		Random r = new Random();
		guesserNumber = r.nextInt(10);//from=1 to=11-1
		return guesserNumber;
		
	}
}