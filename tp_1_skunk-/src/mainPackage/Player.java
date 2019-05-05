package mainPackage;

import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Player {

	public LinkedList<Round> round = new LinkedList<Round>();
	Game game;

	private String name;
	private int score;
	private int chips;
	
	public Player(int playerNumber) {
		chips = 50;
		
		StdOut.println("What is player " + playerNumber + "'s name?");

		StdIn.readLine();
		name = StdIn.readString();
		this.setName(name);
	}
	
	// Refactoring part of the assignment
	// Code smell: constructor is doing many things
	// Used Extract Method to remove the code smell
	// GRASP used:  High Cohesion. By making the class more cohesive, the code is more reusable.
	public void newRound () {
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
	
	public int getChips() {
		return chips;
	}

	public void setChips(int addChips) {
		this.chips = this.chips + addChips;
	}


}
