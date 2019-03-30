package mainPackage;

import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class TurnController {

	private LinkedList <Dice> dice;
	private int counter = 0;
	private boolean turnOver = false;
	private TurnView turnView = new TurnView();
	
	private String question;
	
	
	
	TurnController (LinkedList <Dice> dice) {
		
		this.dice = dice;
		
	}
	
	
	
	TurnController () {
		
	while (turnOver==false) 
	{		
		dice.add(new Dice());
		dice.get(counter).roll();
		
		turnView.showDice(dice, counter);
		
		
		if((dice.get(counter).getDie1() == 1) && (dice.get(counter).getDie2() == 1))
		{
			// Lose accumulated score
			
			turnView.looseAccumulatedScore();
			
			turnOver = true;
			turnTotal = 0;
		}
		else if((dice.get(counter).getDie1() == 1) || (dice.get(counter).getDie2() == 1))
		{
			// Lose turn score
			StdOut.println("Lose turn score.");
			turnOver = true;
			turnTotal = 0;
		}
		else
		{
			// No skunks. Continue turn.
			// Error handling for invalid responses
			do{					
				StdOut.println("Would you like to go again? Y/N");
				question = StdIn.readString();
			} while (!question.matches("N|n|Y|y")); 
			
			if (question.equals("N") || question.equals("n"))
			{
				turnOver = true;
			}
			turnTotal = turnTotal+dice.get(counter).getLastRoll();
		}			
		counter++;
	}
	
	// Print out roll summary for player's turn
	StdOut.println("\nYour roll summary is: ");		
	for (int i =0; i<counter; i++) 
	{			
		StdOut.println ("Roll " + (i+1) + ":  " + dice.get(i).getLastRoll());			
	}
	
	StdOut.println("Your dice roll total is:  "+  turnTotal);
	
	}
	
}
