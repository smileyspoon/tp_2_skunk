package mainPackage;

import java.util.LinkedList;

import edu.princeton.cs.introcs.StdOut;

public class TurnView {
	
	
	TurnView () {
		
	}
	
	public void showDice (LinkedList <Dice> dice, int counter) {
		
		StdOut.println("Die 1 is " + dice.get(counter).getDie1() + ".");
		StdOut.println("Die 2 is " + dice.get(counter).getDie2() + ".");
		StdOut.println("Your roll total is " + dice.get(counter).getLastRoll() + ".\n");
		
	}
	
	public void looseAccumulatedScore () {
		
		StdOut.println("Lose accumulated score.");
	}

}
