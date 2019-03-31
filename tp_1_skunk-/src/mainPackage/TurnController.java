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

	TurnController() {

	}

	//this is the main method for this class.  has all the flow from start to finish
	public void startTurn(Turn turn) throws Exception {

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


		if (rollResult.equals("Double Skunk")) {
			// Lose accumulated score, turn is over, and turns the doubleSkunk flag to be true
			turnView.loseAccumulatedScore();
			turnOver = true;
			turnTotal = 0;
			setTotalScore();
			turn.setDoubleSkunk(true);;
		} else if (rollResult.equals("Skunk Duce")) {
			// Lose turn score, lose turn
			//need logic for losing 2 chips
			turnView.loseTurnScore();
			turnOver = true;
			turnTotal = 0;
			setTotalScore();
		} else if (rollResult.equals("Regular Skunk")) {
			// Lose turn score, lose turn
			//need logic for losing 1 chip
			turnView.loseTurnScore();
			turnOver = true;
			turnTotal = 0;
			setTotalScore();
		} else if (rollResult.equals("Not Skunk")) {
			// No skunks. Continue turn.
			

			addScore(dice.get(counter).getLastRoll());
			setTotalScore();
			rollQuestion();

		}

		else {

			//this is my not so great attempt for error handling
			throw new Exception("This is messed up ");
		}
	}

	
	private void rollQuestion() {

		do {

			turnView.rollQuestion();

			question = StdIn.readString();
		} while (!question.matches("N|n|Y|y"));

		if (question.equals("N") || question.equals("n")) {
			turnOver = true;
		}

	}

	private void addScore(int score) {
		turnTotal = turnTotal + score;
	}

	private void setTotalScore() {
		turn.setTurnTotal(turnTotal);
	}
	
}
