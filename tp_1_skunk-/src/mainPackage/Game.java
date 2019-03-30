package mainPackage;

import java.util.LinkedList;

public class Game {
	
	private LinkedList<Round> round = new LinkedList<Round>();
	
	Game () {
		
	}

	public LinkedList<Round> getRound() {
		return round;
	}

	public void setRound(LinkedList<Round> round) {
		this.round = round;
	}

}
