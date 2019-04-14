package mainPackage;

import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class TurnView {

	private String question="";
	
	
	TurnView() {

	}

	public void showDice(LinkedList<Dice> dice, int counter) {

		StdOut.println("Die 1 is " + dice.get(counter).getDie1() + ".");
		StdOut.println("Die 2 is " + dice.get(counter).getDie2() + ".");
		StdOut.println("Your roll total is " + dice.get(counter).getLastRoll() + ".\n");

	}

	public void loseAccumulatedScore() {

		StdOut.println("Lose accumulated score.");
	}

	public void loseTurnScore() {

		StdOut.println("Lose turn score.");
	}


	public void rollSummary(LinkedList<Dice> dice, int counter, int turnTotal) {

		StdOut.println("\nYour roll summary is: ");
		for (int i = 0; i < counter; i++) {
			StdOut.println("Roll " + (i + 1) + ":  " + dice.get(i).getLastRoll());
		}

		StdOut.println("Your dice roll total is:  " + turnTotal);

	}
	
	public boolean rollQuestion() {
		
		boolean turnOver =false;

		do {

			StdOut.println("Would you like to roll? Y/N");

			question = StdIn.readString();
		} while (!question.matches("N|n|Y|y"));

		if (question.equals("N") || question.equals("n")) {
			turnOver = true;
			
		}
		
		return turnOver;

	}
	
	public void lostChip(int chip) {
		
		StdOut.println("You lost " + chip + " chip(s)");
		
	}


}
