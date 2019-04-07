package mainPackage;

import java.util.LinkedList;

//turn class only holds the turnTotal dice amount you accumulated, linked list of the dices rolled for the turn
//and also a flag called doubleSkunk to see during this turn a doubleSkunk was rolled
//new a new round is created, it will check to see if the most recent turn had a double skunk and set the entire roundscore
//to zero before starting the new round
public class Turn {

	public int turnTotal = 0;
	public LinkedList<Dice> dice = new LinkedList<Dice>();
	public boolean doubleSkunk = false;

	Turn() {

	}

	public int getTurnTotal() {
		return turnTotal;
	}
	

	public LinkedList<Dice> getDice() {
		return dice;
	}

	public void setTurnTotal(int turnTotal) {
		this.turnTotal = turnTotal;
	}

	public boolean getDoubleSknuk() {
		return doubleSkunk;
	}

	public void setDoubleSkunk(boolean roundTotalZero) {
		this.doubleSkunk = roundTotalZero;
	}
	

}