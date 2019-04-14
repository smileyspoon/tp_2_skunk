import static org.junit.Assert.*;
import mainPackage.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;
import mainPackage.Game;
import mainPackage.Round;

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

}
