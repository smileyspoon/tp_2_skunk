package mainPackage;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Player {

	private Game game;

	private String name;
	private int score;

	Player(int playerNumber) throws Exception {
		StdOut.println("What is player " + playerNumber + "'s name?");

		StdIn.readLine();
		name = StdIn.readString();

		this.setName(name);
		newGame();
		
		
	}
	
	public void Player() {
		//
	}
	
	public void newGame () throws Exception {
		
		game = new Game();
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


	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}

}
