package mainPackage;

import java.util.LinkedList;

//no chips yet
public class Game {
	
	public LinkedList<Round> round = new LinkedList<Round>();
	
	public Game () throws Exception {
		
		newRound();
		
	}
	
	public void newRound () throws Exception {
		
		round.add(new Round());
	}

	public LinkedList<Round> getRound() {
		return round;
	}

	public void setRound(LinkedList<Round> round) {
		this.round = round;
	}
	
	public Round getCurrentRound () {
		
		return round.getLast();
	}
	
	public Turn getCurrentTurn() {
		
		return getCurrentRound().getCurrentTurn();
	}

	
}
