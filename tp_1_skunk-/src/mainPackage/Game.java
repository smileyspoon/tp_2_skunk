package mainPackage;

import java.util.LinkedList;

//no chips yet
public class Game {
	
	private static LinkedList<Player> player = new LinkedList<Player>();
	private static int kitty;
	
	public Game () {		
		kitty = 0;
	}
	
	public void newPlayer(int playerNumber) {
		player.add(new Player(playerNumber));
	}
	
	public Player getPlayer(int index) {
		return player.get(index);		
	}
}
