package mainPackage;

import java.util.LinkedList;

//no chips yet
public class Game {
	
	public LinkedList<Round> round = new LinkedList<Round>();
	
	public Game () throws Exception {		
		round.add(new Round());
	}
	
	public Round getCurrentRound () {
		
		return round.getLast();
	}
	
	public Turn getCurrentTurn() {
		
		return getCurrentRound().getCurrentTurn();
	}	
}
