import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import mainPackage.Game;
import mainPackage.Player;

public class playerTest {
	
	private String name;
	private int score;
	private Game game;
	Player player;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void setNameTest() throws Exception {
		Player player = new Player();
		String name ="Sheila";
		player.setName(name);
		assertEquals(name, player.getName());
	}
	


	@Test
	public void getScoreTest() throws Exception {
		Player player = new Player();
		player.setScore(15);
		assertEquals(15, player.getScore());
	}
	
	@Test
	public void getGame() throws Exception {
		Player player = new Player();
		Game game = new Game();
		game.getCurrentRound().newTurn();
		game.getCurrentRound().newTurn();
		player.setGame(game);
		
		assertEquals(3, player.getGame().getCurrentRound().getTurnNumber());
		
		
		

	}

}
