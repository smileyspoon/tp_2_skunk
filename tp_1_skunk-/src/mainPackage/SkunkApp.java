package mainPackage;

import java.util.InputMismatchException;
import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp 
{
	private static int numberOfPlayer = 1;
	private static String question;
		
	public static void main(String[] args) throws Exception 
	{	
		LinkedList <Player> player = new LinkedList<Player>();
		boolean gameCompleted = false;
		
		StdOut.println("**********************************");
		StdOut.println("** Welcome to the Skunk game!!! **");
		StdOut.println("**********************************\n");
		
		
		// Query user for amount of players
		do {			
			StdOut.println("How many players?");			
			
			try 
			{
				numberOfPlayer = StdIn.readInt();
			}
			
			catch (InputMismatchException e)
			
			{
				
				StdOut.println("Invalid input");
				
			}
			if(numberOfPlayer < 2)
			{
				StdOut.println("At least 2 players are required to start a game.\n");
			}
			
		} while(numberOfPlayer < 2);
		
		// Enter name for each player
		for (int i =0; i< numberOfPlayer; i++) 
		{			
			player.add(new Player(i+1));			
		}
		
		while(!gameCompleted)
		{			
			// Players take their turns
			for (int i = 0; i < numberOfPlayer; i++) 
			{
				StdOut.println("\n******************************");
				StdOut.println("It's turn " + player.get(i).getGame().getRound(0).getT + " for player " + player.get(i).getName() + ".\n");
				player.get(i).newTurn();
			}
			
	
			
			
				while (!gameCompleted)
				{
				
					do{					
						StdOut.println("Continue playing the game? Y/N");
						question = StdIn.readString();
					} while (!question.matches("N|n|Y|y")); 
					
					if (question.equals("Y") || question.equals("y"))
					{
						main(null);
					} else
					gameCompleted = true;
					StdOut.println("Game is over.");
				}

			
			}

	}
	
}