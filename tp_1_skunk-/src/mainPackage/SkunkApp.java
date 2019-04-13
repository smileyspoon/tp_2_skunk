package mainPackage;

import java.util.InputMismatchException;
import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import java.io.FileReader;
import java.io.BufferedReader;

public class SkunkApp {
	private static int numberOfPlayer = 1;
	private static String question;
	private static LinkedList<Player> player = new LinkedList<Player>();

	public static void main(String[] args) throws Exception {

		boolean gameCompleted = false;

		StdOut.println("**********************************");
		StdOut.println("** Welcome to the Skunk game!!! **");
		StdOut.println("**********************************\n");

		// Query user for amount of players
		do {
			StdOut.println("How many players?");

			try {
				numberOfPlayer = StdIn.readInt();
			} catch (InputMismatchException e) {
				StdOut.println("Invalid input");
			}
			
			if (numberOfPlayer < 2) {
				StdOut.println("At least 2 players are required to start a game.\n");
			}
		} while (numberOfPlayer < 2);

		// Enter name for each player
		for (int i = 0; i < numberOfPlayer; i++) {
			player.add(new Player(i + 1));
		}

		// Query players for complete listing of rules
		rules();
		
		// This block is for 1 game of multiple rounds
		// After 1 player gets to 100 every other player gets one more turn to pass them
		while (!gameCompleted) {
			// check to see if a player is over 100
			for (int i = 0; i < numberOfPlayer; i++) {
				if (player.get(i).getGame().getCurrentRound().getRoundTotal() >= 20) {
					StdOut.println(player.get(i).getName() + " has scored " + player.get(i).getGame().getCurrentRound().getRoundTotal() + " points!");
					StdOut.println("All players get one more turn to score more than " + player.get(i).getName());	
				}				
			}
			
			// Players take their turns
			for (int i = 0; i < numberOfPlayer; i++) {
				if (player.get(i).getGame().getCurrentRound().getRoundTotal() < 20) {
					StdOut.println("\n\n\n******************************");
					StdOut.println("Hello " + player.get(i).getName());
					StdOut.println("It's turn " + player.get(i).getGame().getCurrentRound().getTurnNumber() + ".\n");
					TurnController turnController = new TurnController();
					turnController.startTurn(player.get(i).getGame().getCurrentTurn());
				} else {
					gameCompleted = true;
				}
			}			
 
			// Print player turns summary 
			roundSummary();			
		}
		
		StdOut.println("We have a game winner!");
		roundSummary();
	}

	public static void roundSummary() throws Exception {

		for (int i = 0; i < numberOfPlayer; i++) {

			player.get(i).getGame().getCurrentRound().newTurn();

			StdOut.println("\n******************************");
			StdOut.println("\n********Round Summary*********");
			StdOut.println("\n******************************");
			StdOut.println(player.get(i).getName() + "'s Round score is:  "
					+ player.get(i).getGame().getCurrentRound().getRoundTotal());
			StdOut.println("\n");

		}

	}
	
	private static void rules() throws Exception {
		StdOut.println("\nWould you like to view the rules for the game of Skunk?");
		
		if (StdIn.readString().matches("Y|y")) {
			BufferedReader br = new BufferedReader(new FileReader("resources/rules.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		
		StdOut.println("Press any key to continue....\n");
		System.in.read();
	}

}