package mainPackage;

import java.util.LinkedList;

//no chips yet
public class Game {
	
	private static LinkedList<Player> player = new LinkedList<Player>();
	//private static int kitty;
	
	public Game () {		

		
	}
	public int Kitty = 0;
	
	public int getKitty() {
		return Kitty;
	}
	public void setKitty(int Kitty) {
		this.Kitty = Kitty;
	}
	
	
	public void newPlayer(int playerNumber) {
		player.add(new Player(playerNumber));
	}
	
	public Player getPlayer(int index) {
		return player.get(index);		
	}
	
	public int totalPlayers() {
		return player.size();
	}
	
	
	
	
}
