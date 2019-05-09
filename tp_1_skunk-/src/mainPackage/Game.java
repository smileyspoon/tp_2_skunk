package mainPackage;

import java.util.LinkedList;

//no chips yet
public class Game {
	
	public int kitty = 0;
	private static LinkedList<Player> player = new LinkedList<Player>();
	private static LinkedList<String> eliminatedPlayers = new LinkedList<String>();
	
	public Game () {		
	
	}
	
	public int getKitty() {
		return kitty;
	}
	
	public void setKitty(int kitty) {
		this.kitty = this.kitty -kitty;
	}	
	
	public void resetKitty() {
		
		this.kitty = 0;
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
	
	public void eliminatePlayer(int playerIndex) {
		eliminatedPlayers.add(player.get(playerIndex).getName());
		player.remove(playerIndex);
	}
	
	public LinkedList<String> getEliminatedPlayers() {
		return eliminatedPlayers;
	}
}
