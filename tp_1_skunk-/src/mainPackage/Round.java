package mainPackage;

import java.util.LinkedList;

public class Round {

	private LinkedList<Turn> turn = new LinkedList<Turn>();
	private int roundTotal = 0;
	private int roundChip =0;

	public Round() {
	}

	public void newTurn() {
		turn.add(new Turn());
	}
	
	public void addTurnToRoundTotal() {
		roundTotal = roundTotal + turn.getLast().getTurnTotal();
		roundChip = roundChip + turn.getLast().getTurnChip();

		// check if the most recent turn had a double skunk, if true will set current roundtotal to zero
		if (turn.getLast().getDoubleSknuk() == true) {
			roundTotal = 0;
		}
	}

	public int getRoundTotal() {
		return roundTotal;
	}
	
	public void setRoundTotal(int roundTotal) {
		this.roundTotal= roundTotal;
	}

	public int getTurnNumber() {
		return (turn.size());
	}

	public LinkedList<Turn> getTurn() {
		return turn;
	}

	public void setTurn(LinkedList<Turn> turn) {
		this.turn = turn;
	}

	public Turn getCurrentTurn() {

		return turn.getLast();
	}

	public int getRoundChip() {
		return roundChip;
	}

	public void setRoundChip(int roundChip) {
		this.roundChip = roundChip;
	}
	
	public int lastTurnChip() {
		return getCurrentTurn().getTurnChip();
	}
}
