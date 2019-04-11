import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;
import mainPackage.Game;
import mainPackage.Round;

public class gameTest {
	
	Game game;
	public LinkedList<Round> round = new LinkedList<Round>();
	
	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test() throws Exception {
		game = new Game();
		
		game.getCurrentRound();		
		game.getCurrentTurn();		
	}

}
