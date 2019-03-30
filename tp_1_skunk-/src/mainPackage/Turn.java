package mainPackage;

import java.util.LinkedList;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Turn {

	private int turnTotal = 0;
	private LinkedList<Dice> dice = new LinkedList<Dice>();

	Turn() {
		// This loop processes rolls for a single player's turn

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
}
