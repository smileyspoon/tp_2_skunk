package mainPackage;

import java.util.LinkedList;

public class TurnController {

	private Turn turn;
	private TurnView turnView = new TurnView();
	private LinkedList<Dice> dice;
	private int counter = 0;
	private boolean turnOver = false;

	public TurnController() {

	}

	// this is for testing purposes
	public TurnController(Turn turn) {

		this.turn = turn;
		this.dice = turn.getDice();

	}

	public void startTurn(Turn turn) throws Exception {

		// setting the turn and dice for convenience
		this.turn = turn;
		this.dice = turn.getDice();

		do {
			
			//asks if player wants to roll, then rolls, and will act accordingly based on skunk check

			turnOver = turnView.rollQuestion();

			if (turnOver == false) {

				roll();

			}
		} while (turnOver == false);

		// Print out roll summary for player's turn
		turnView.rollSummary(dice, counter, turn.getTurnTotal());

	}

	// rolls the dice, shows the dice roll, and checks for skunk
	public void roll() throws Exception {

		rollNewDice();

		turnView.showDice(dice, counter);

		Roll roll = new Roll(dice.get(counter));

		checkSkunk(roll.getRollResult());

		counter++;

	}

	public void rollNewDice() {

		dice.add(new Dice());
		dice.get(counter).roll();
	}

	public void checkSkunk(String rollResult) throws Exception {

		/*
		 * 1+1 Double Skunk: double skunk lose turn and accumulated round score, lose 4
		 * chips
		 * 
		 * 1+2, 2+1 Skunk Duce: lose turn, lose current turn score, lose 2 chips
		 * 
		 * 1+ * Regular Skunk: lose turn, lose current turn score, lose 1 chip
		 * 
		 */

		
		//Refactoring part of the assignment
		//refactoring below due to repeated code in the if statement
		//Used Extract Method to remove the code smell
		//GRASP used:  High Cohesion.  By removing repeated code, the code is more manageable and understandable.
		if (rollResult.equals("Double Skunk")) {
			// Lose accumulated score, turn is over, and turns the doubleSkunk flag to be
			// true
			// lose 4 chips
			turnView.loseAccumulatedScore();
			turn.setDoubleSkunk(true);
			skunkPenalty(4);
			
		} else if (rollResult.equals("Skunk Duce")) {
			// Lose turn score, lose turn
			// Lose 2 chips
			turnView.loseTurnScore();
			skunkPenalty(2);
		} else if (rollResult.equals("Regular Skunk")) {
			// Lose turn score, lose turn
			// lose 1 chip
			turnView.loseTurnScore();
			skunkPenalty(1);
		} else if (rollResult.equals("Not Skunk")) {
			// No skunks. Continue turn.

			turn.setTurnTotal((turn.getTurnTotal() + dice.get(counter).getLastRoll()));

			// turnOver = turnView.rollQuestion();

		}

		else {

			// this is my not so great attempt for error handling
			throw new Exception("This is messed up ");
		}
	}

	public void skunkPenalty(int penalty) {
		turnOver = true;
		turn.setTurnTotal(0);
		turn.setTurnChip(-penalty);
		turnView.lostChip(turn.getTurnChip());
	}
	
	public boolean getTurnOver () {
		
		return turnOver;
	}
	
	public void setTurnOver (boolean turnOver) {
		
		this.turnOver = turnOver;
	}

}
