package mainPackage;

import java.util.LinkedList;

public class Round {

	private LinkedList<Turn> turn = new LinkedList<Turn>();
	private int roundTotal = 0;

	public Round() throws Exception {
		newTurn();

	}

	public void newTurn() throws Exception {

		// adding up roundtotal from most current turn
		if (turn.size() >= 1) {
			roundTotal = (roundTotal + turn.getLast().getTurnTotal());
			
			//before adding new turn, will check if the most recent turn had a double skunk, if true
			//will set current roundtotal to zero
			if (turn.getLast().getDoubleSknuk() == true) {
				roundTotal = 0;
			}
		}

		turn.add(new Turn());

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

}
