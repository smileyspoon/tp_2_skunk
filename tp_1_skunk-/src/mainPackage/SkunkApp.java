package mainPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {
	private static int numberOfPlayer = 0;

	private static Game game = new Game();
	
	public static void main(String[] args) throws Exception {

		boolean gameCompleted = false;
		int winnerChipCount = 0;
		String winner = "";
		
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
			game.newPlayer(i+1);
		}

		// Query players for complete listing of rules
		rules();
		
		// Start Game of Skunk
		while(!gameCompleted) {
			 
			// Play one round of Skunk
			playRound();
			
			//Display current player chip standings
			gameStandings();			
			
			// Ask to play again, if no, then game is over and winner is declared
			StdOut.println("\n\n\n Would you like to play another round?");
			if((StdIn.readString().matches("N|n")) || (numberOfPlayer == 1)) {
							
				// Determine winner by checking chip totals for all players
				for (int i = 0; i < numberOfPlayer; i++) {
					if (game.getPlayer(i).getChips() > winnerChipCount) {
						winnerChipCount = game.getPlayer(i).getChips();
						winner = game.getPlayer(i).getName();
					}
				}
				
				// Declare winner
				StdOut.println("The game winner is " + winner + "!");
				
				// Output final chip standings 
				gameStandings();
				
				gameCompleted = true;
			}
		}
	}
	
	private static void playRound() throws Exception {

		boolean roundCompleted = false;
		boolean scored100 = false;
		
		// Initialize new round for all players
		for (int i = 0; i < numberOfPlayer; i++) {
			game.getPlayer(i).newRound();
		}
		
		// This block is for 1 round of multiple turns
		// After 1 player gets to 100 every other player gets one more turn to pass them
		while (!roundCompleted) {
			
			StdOut.println("\nA new turn is starting.");
			StdOut.println("Press any key to continue....\n");
			System.in.read();
			
			// if someone has scored 100 these are the last turns
			if (scored100 == true) {
				roundCompleted = true;
			}

			// Players take their turns
			for (int i = 0; i < numberOfPlayer; i++) {
				// taking turns and only allowing to take turn if starting with < 100 points in round
				if (currentPlayerRound(i).getRoundTotal() < 100) {	
					StdOut.println("\n\n******************************");					
					StdOut.println("Hello " + game.getPlayer(i).getName());
					StdOut.println("It's turn " + currentPlayerRound(i).getTurnNumber() + ".\n");
			
					// Create new turn for player
					currentPlayerRound(i).newTurn();
					
					// Player takes their turn
					TurnController turnController = new TurnController();
					turnController.startTurn(game.getPlayer(i).getCurrentTurn());
					currentPlayerRound(i).addTurnToRoundTotal();
					game.getPlayer(i).setChips(currentPlayerRound(i).lastTurnChip());
					game.setKitty(game.getPlayer(i), currentPlayerRound(i).getCurrentTurn().getTurnChip());
					
					// These conditions are only true for first to score 100 points in the round
					if ((currentPlayerRound(i).getRoundTotal() >= 100) && (scored100 == false)) {
						StdOut.println(game.getPlayer(i).getName() + " has scored " + currentPlayerRound(i).getRoundTotal() + " points!");
						StdOut.println("All players get one more turn to score more than " + game.getPlayer(i).getName());
						scored100 = true;
						break;
					}
					
					// Eliminate player if they have 0 chips
					if (game.getPlayer(i).getChips() < 1) {
						game.eliminatePlayer(i);
						numberOfPlayer--;
						
						// End round if only 1 player is left
						if (numberOfPlayer == 1) {
							roundCompleted = true;
						}
					}
				}
			}
			
			// Print round summary for all players
			
			roundStandings();		
		}

		int maxScore = 0;
		int maxIndex = 0;
		
		// Determine winner by checking chip totals for all players
		for (int i = 0; i < numberOfPlayer; i++) {
			// subtract 10 chips from players with 0 score in round and add them to kitty
			// subtract 5 chips from all other players and add them to kitty
			if (currentPlayerRound(i).getRoundTotal() == 0) {
				game.getPlayer(i).setChips(-10);
				game.setKitty(game.getPlayer(i), -10);
			}
			else if (currentPlayerRound(i).getRoundTotal() > maxScore) {
				maxScore = currentPlayerRound(i).getRoundTotal();
				maxIndex = i;
				game.getPlayer(i).setChips(-5);
				game.setKitty(game.getPlayer(i), -5);
			}
			else {
				game.getPlayer(i).setChips(-5);
				game.setKitty(game.getPlayer(i), -5);
			}
		}
		
		// Declare winner
		StdOut.println("The round winner is " + game.getPlayer(maxIndex).getName() + "!");		
		
		// Award kitty to highest scorer
		game.getPlayer(maxIndex).setChips(game.getKitty());
		//reset kitty to zero
		game.resetKitty();
		
		// Print final round summary
		roundStandings();
	}

	// Refactoring part of the assignment
	// Code smell is repeated code (deeply nested linked lists)
	// Used Extract Method to remove the code smell
	// By refactoring , the code is more readable and less prone to bug insertions during maintenance.
	private static Round currentPlayerRound(int i) {
		return game.getPlayer(i).getCurrentRound();
	}

	public static void gameStandings() {
		// Display player standings
		StdOut.println("\n************************************************");
		StdOut.println("\n**************Game Player Standings*************");
		StdOut.println("\n************************************************");
		StdOut.printf("\n%15s %25s", "NAME", "CHIPS");
		
		for (int i = 0; i < numberOfPlayer; i++) {
			StdOut.printf("\n%15s %25d", game.getPlayer(i).getName(), game.getPlayer(i).getChips());
		}
		
		// Append names of eliminated players
		LinkedList<String> elimPlayers = new LinkedList<String>();
		elimPlayers = game.getEliminatedPlayers();
		for (int i = 0; i < elimPlayers.size(); i++) {
			StdOut.printf("\n%15s %25s", elimPlayers.get(i), "ELIMINATED");
		}		
	}
	
	public static void roundStandings() throws Exception {
		// Display player standings
		StdOut.println("\n************************************************");
		StdOut.println("\n*************Round Player Standings*************");
		StdOut.println("\n************************************************");
		StdOut.printf("\n%12s %17s %7s", "NAME", "ROLL SCORE", "CHIPS");
		
		for (int i = 0; i < numberOfPlayer; i++) {
			
			StdOut.printf("\n%12s %12d %9d", game.getPlayer(i).getName(), currentPlayerRound(i).getRoundTotal(), game.getPlayer(i).getChips());
		}
						
		StdOut.println("\n");
	}
	
	// This method reads the rules from a text file
	private static void rules() throws Exception {
		StdOut.println("\nWould you like to view the rules for the game of Skunk?");
		
		if (StdIn.readString().matches("Y|y")) {
			BufferedReader br = new BufferedReader(new FileReader("resources/rules.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
}