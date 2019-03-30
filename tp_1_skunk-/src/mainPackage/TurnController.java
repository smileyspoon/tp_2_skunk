package mainPackage;

import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class TurnController {

	private Turn turn;
	private TurnView turnView = new TurnView();
	private LinkedList<Dice> dice;

	private int counter = 0;
	private boolean turnOver = false;
	private String question;
	private int turnTotal = 0;
	
	TurnController () {
		
	}

	TurnController(Turn turn) throws Exception{

		this.turn = turn;
		dice = turn.getDice();
		rollQuestion();

		while (turnOver == false) {

			rollNewDice();

			turnView.showDice(dice, counter);

			Roll roll = new Roll(dice.get(counter));

			checkSkunk(roll.getRollResult());

			counter++;
		}

		// Print out roll summary for player's turn
		turnView.rollSummary(dice, counter, turnTotal);

	}

	private void rollNewDice() {

		dice.add(new Dice());
		dice.get(counter).roll();
	}

	public void checkSkunk(String rollResult) throws Exception {
		// We need to give the player the option to NOT roll the first time

		if (rollResult.equals("Double Skunk")) {
			// Lose accumulated score
			turnView.loseAccumulatedScore();

			turnOver = true;
			turnTotal = 0;
		} else if (rollResult.equals("Skunk Duce") || rollResult.equals("Regular Skunk")) {
			// Lose turn score
			turnView.loseTurnScore();

			turnOver = true;
			turnTotal = 0;
		} else if (rollResult.equals("Not Sknuk")) {
			// No skunks. Continue turn.
			// Error handling for invalid responses

			rollQuestion();

		}

		else {

			throw new Exception("This is messed up ");
		}
	}

	private void rollQuestion() {

		do {

			turnView.playAgainQuestion();

			question = StdIn.readString();
		} while (!question.matches("N|n|Y|y"));

		if (question.equals("N") || question.equals("n")) {
			turnOver = true;
		}
		turnTotal = turnTotal + dice.get(counter).getLastRoll();

	}

}
