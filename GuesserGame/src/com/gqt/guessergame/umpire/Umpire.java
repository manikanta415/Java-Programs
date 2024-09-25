package com.gqt.guessergame.umpire;

import com.gqt.guessergame.guesser.Guesser;
import com.gqt.guessergame.player.Player;

public class Umpire {
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	public void collectNumberFromGuesser() {
		Guesser g = new Guesser();
		numberFromGuesser = g.guesserNumber();
	}
	public void collectNumberFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numberFromPlayer1 = p1.playernumber();
		numberFromPlayer2 = p2.playernumber();
		numberFromPlayer3 = p3.playernumber();
					
	}
	public void compare() {
		if(numberFromGuesser == numberFromPlayer1) {
			System.out.println("Player1 wins");
		}
		else if(numberFromGuesser == numberFromPlayer2) {
			System.out.println("Player2 wins");
		}
		else if(numberFromGuesser == numberFromPlayer3) {
			System.out.println("Player3 wins");
		}
		
		else {
			System.out.println("Game lot try again!!!!");
		}
		System.out.println("Number guessd by the guesser is"+numberFromGuesser);
		
		}
	}

	


