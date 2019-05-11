import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import mainPackage.Player;

public class playerTest {

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
	public void getChipsTest() throws Exception {
		Player player = new Player();
		int chips = 50;
		player.setChips(chips);
		assertEquals (100, player.getChips());
						
	}
	
	@Test 
	
	//new round's roundtotal should be zero since just started round
	public void newRoundTest () {
		Player player = new Player ();
		
		player.newRound();
		
		assertEquals(0, player.getCurrentRound().getRoundTotal());
		
		
	}
	
	
	@Test 
	
	//getting the new turn.  should be zero turntoal when new turn
	public void getCurrentTurnTest () {
		Player player = new Player ();
		
		player.newRound();
		player.getCurrentRound().newTurn();

		
		assertEquals(0, player.getCurrentRound().getCurrentTurn().getTurnTotal());
		
		
	}
}
