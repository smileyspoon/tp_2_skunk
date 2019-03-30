package mainPackage;
import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Turn 
{
	
	private int counter = 0;
	private boolean turnOver = false;
	private LinkedList <Dice> dice = new LinkedList <Dice>();
	private int turnTotal = 0;
	private String question;
	private boolean skunked = false;
	
	Turn () 
	{	
		// This loop processes rolls for a single player's turn
		while (turnOver==false) 
		{		
			dice.add(new Dice());
			dice.get(counter).roll();
			
			StdOut.println("Die 1 is " + dice.get(counter).getDie1() + ".");
			StdOut.println("Die 2 is " + dice.get(counter).getDie2() + ".");
			StdOut.println("Your roll total is " + dice.get(counter).getLastRoll() + ".\n");
			
			if((dice.get(counter).getDie1() == 1) && (dice.get(counter).getDie2() == 1))
			{
				// Lose accumulated score
				StdOut.println("Lose accumulated score.");
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
	
	public int getTurnTotal () 
	{		
		return turnTotal;
	}
	
	public LinkedList<Dice> getDice() 
	{		
		return dice;
	}

}

