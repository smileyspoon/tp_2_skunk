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

//	@Before
//	public void setUp() throws Exception {
//		this.player1=new Player();
//		this.player2= new Player("New Player");
//	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void setNameTest() throws Exception {
		String name ="Sheila";
		Player player = new Player();
		player.setName(name);
		assertEquals(player.getName(),name);
	}
	
	@Test
	public void getNameTest() throws Exception {
		Player player = new Player();
		player.setName("test");
		assertEquals("test", player.getName());
	}


	@Test
	public void getScoreTest() throws Exception {
		Player player = new Player();
		player.setScore(2);
		assertEquals(player.getScore(), 2);		
	}
	
	@Test
	public void setScoreTest() throws Exception {
		Player player = new Player();
		player.setScore(5);
		assertEquals(player.getScore(), 5);		
	}
	
	@Test
	public void setGame_getGame() throws Exception {
		Game game = new Game();
		Player player = new Player();
		player.setGame(game);
		
		// This checks to see if we are getting what we are setting
		assertEquals(game, player.getGame());
	}

}
