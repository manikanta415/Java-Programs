package com.gqt.guessergame.player;
import java.util.Scanner;

public class Player {
	int playerNumber;
	public int playernumber(){
		System.out.println("Player kindly quess a number from 1 to 10");
		Scanner scan = new Scanner(System.in); 
		playerNumber = scan.nextInt();
		return playerNumber;

	}

}
