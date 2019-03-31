package mainPackage;

import java.util.InputMismatchException;
import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

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
			}

			catch (InputMismatchException e)

			{

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

		while (!gameCompleted) {
			// Players take their turns
			for (int i = 0; i < numberOfPlayer; i++) {
				StdOut.println("\n******************************");
				StdOut.println("Hello " + player.get(i).getName());
				StdOut.println("It's turn " + player.get(i).getGame().getCurrentRound().getTurnNumber() + ".\n");
				TurnController turnController = new TurnController();
				turnController.startTurn(player.get(i).getGame().getCurrentTurn());
			}

			do {
				StdOut.println("Continue playing the game? Y/N");
				question = StdIn.readString();
				if (question.matches("n|N")) {
					gameCompleted = true;
					roundSummary();
					StdOut.println("Game is over.");

				}

				else if (question.matches("Y|y")) {

					roundSummary();

				} else {

					StdOut.println("Please enter Y or N");

				}

			}

			while (!question.matches("N|n|Y|y"));

		}

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

}