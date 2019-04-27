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
		game.getPlayer(1).setName("Jim");;		
		
		assertEquals ("Jim",game.getPlayer(1).getName());
				
	}

}
