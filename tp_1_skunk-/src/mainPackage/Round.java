package mainPackage;

import java.util.LinkedList;

public class Round {
	
	private LinkedList<Turn> turn = new LinkedList<Turn>();
	
	Round () throws Exception {
		newTurn();
		
	}
	
	public void newTurn() throws Exception {
		turn.add(new Turn());
		TurnController turnController = new TurnController(turn.getLast());
	}
	

	public int getTurnNumber() {
		return (turn.size() + 1);
	}


	public LinkedList<Turn> getTurn() {
		return turn;
	}

	public void setTurn(LinkedList<Turn> turn) {
		this.turn = turn;
	}
	
	

}
