import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Game;
import mainPackage.Player;

public class gameTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void newPlayerTest() throws Exception {
		Game game = new Game();

		game.newPlayer(1);
		game.newPlayer(2);
		game.newPlayer(3);

		assertEquals(3,game.totalPlayers());
	}

	@SuppressWarnings("unused")
	@Test
	public void getPlayerTest() throws Exception {
		Player player = new Player(1);
		Game game = new Game();
		game.getPlayer(1).setName("Jim");

		assertEquals ("Jim",game.getPlayer(1).getName());

	}

	@Test
	public void getKittyTest() {
		Game game = new Game();
		Player player = new Player(1);
		game.setKitty(player, 5);
		assertEquals((-5),game.getKitty());

	}
	@Test
	public void setKittyTest() {
		Game game = new Game();
		Player player = new Player(1);
		game.setKitty(player, 17);
		assertEquals(17,17);

	}
	@Test
	public void resetKittyTest() {
		Game game = new Game();
		Player player = new Player(1);
		game.setKitty(player,15);
		game.resetKitty();

		assertEquals(0,0);
	}
	
	
	@Test
	public void kittyAndNegativePlayerScore() throws Exception {
		Game game = new Game();
		game.newPlayer(1);
		//set player's chip to -1, as if lost two chips due to double duce, and is at -1 chip because not enough chips
		game.getPlayer(0).setChips(-51);
		
		//simulate as if rolled double duce
		game.setKitty(game.getPlayer(0), -2);
		
		//kitty should have 1 chip, since only one chip to give to kitty
		assertEquals ("",1,game.getKitty());
				
	}

////	@Test
////	public void eliminatePlayerTest () throws Exception {
////		Game game = new Game();
////		@SuppressWarnings("unused")
////		Player player = new Player(1);
////		game.getPlayer(1);
////		game.eliminatePlayer(1);
////
////		assertEquals(1, player.size());
////
////	}
//
//	@Test
//	public void getEliminatedPlayers() throws Exception{
//
//	}

	//Testing




}
