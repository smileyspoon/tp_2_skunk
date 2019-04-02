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
	public void setNameTest() {
		System.out.println("setNameTest");
		String name ="Sheila";
		Player player = new Player();
		player.setName(name);
		assertEquals(player.getName(),name);
	}
	
	@Test
	public void getNameTest() {
		System.out.println("getNameTest");
		Player player = new Player();
		player.setName("test");
		assertTrue(player.getName()== "test");
	}


	@Test
	public void getScoreTest() {
		Player player = new Player();
		player.setScore(2);
		assertTrue(player.getScore()== 2);
		
		
	}
	
	@Test
	public void setScoreTest() {
		Player player = new Player();
		player.setScore(5);
		assertTrue(player.getScore()==5);
		
	}
	
	@Test
	public void getGame() {
		
	}
	
	@Test
	public void setGame() {
		
	}

}
