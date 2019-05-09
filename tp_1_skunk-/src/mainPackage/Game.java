package mainPackage;

import java.util.LinkedList;

//no chips yet
public class Game {

	public int kitty = 0;
	private static LinkedList<Player> player = new LinkedList<Player>();
	private static LinkedList<String> eliminatedPlayers = new LinkedList<String>();

	public Game() {

	}

	public int getKitty() {
		return kitty;
	}

	// accounts for if player's chip is negative
	public void setKitty(Player player, int kitty) {

		if (player.getChips() < 0) {

			//since player chip will be a negative number, add back the negative number to negate the difference
			this.kitty = this.kitty - kitty+ player.getChips();
		}

		else {
			this.kitty = this.kitty - kitty;
		}
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
