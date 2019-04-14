package mainPackage;

import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Player {

	public LinkedList<Round> round = new LinkedList<Round>();
	Game game;

	private String name;
	private int score;
	
	public Player(int playerNumber) {
		StdOut.println("What is player " + playerNumber + "'s name?");

		StdIn.readLine();
		name = StdIn.readString();

		this.setName(name);
		round.add(new Round());		
	}
	
	public Round getCurrentRound () {
		return round.getLast();
	}
	
	public Turn getCurrentTurn() {
		return getCurrentRound().getCurrentTurn();
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
