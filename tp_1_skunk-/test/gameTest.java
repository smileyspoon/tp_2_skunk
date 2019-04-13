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
	

	public LinkedList<Round> round = new LinkedList<Round>();
	
	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void getCurrentRoundTest() throws Exception {
		Game game = new Game();
		game.getCurrentRound().newTurn();
		game.getCurrentRound().newTurn();

		
		assertEquals(3,game.getCurrentRound().getTurn().size());
	
	}
	
	@Test
	public void getCurrentTurnTest() throws Exception {
		Game game = new Game();
		game.getCurrentRound().newTurn();
		game.getCurrentRound().newTurn();
		game.getCurrentTurn().setTurnTotal(15);

		
		assertEquals(15,game.getCurrentTurn().getTurnTotal());
	}


}
