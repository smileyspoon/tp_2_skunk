package mainPackage;

import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp 
{
	private static int numberOfPlayer = 1;
		
	public static void main(String[] args) 
	{	
		LinkedList <Player> player = new LinkedList<Player>();
		boolean gameCompleted = false;
		
		StdOut.println("**********************************");
		StdOut.println("** Welcome to the Skunk game!!! **");
		StdOut.println("**********************************\n");
		
		// Query user for amount of players
		do {			
			StdOut.println("How many players?");			
			numberOfPlayer = StdIn.readInt();
			
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
				StdOut.println("It's turn " + player.get(i).getTurnNumber() + " for player " + player.get(i).getName() + ".\n");
				player.get(i).newTurn();
			}
			
			StdOut.println("Continue playing the game? Y/N");			
			if (StdIn.readString().matches("N|n"))
			{				
				gameCompleted = true;
			}
		}
	
		StdOut.println("Game is over.");

	}
}