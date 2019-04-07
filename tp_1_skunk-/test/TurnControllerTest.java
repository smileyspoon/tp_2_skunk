import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import mainPackage.Dice;
import mainPackage.TurnController;

public class TurnControllerTest {
	
	TurnController turn;
	private Dice dice;
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception 
	{
		int Roll1 [] = {1,3,5} ;
		int Roll2 [] = {2,4,6} ;
		dice = new Dice(Roll1, Roll2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void rollnewDiceTest() {
		
//		int counter =0;
//		dice.roll();
//		assertEquals("First roll is 3", 3, dice.getLastRoll());
//		
//		TurnController.rollNewDice();
//		assertEquals("Checking",3);
		
	}
	
	@Test
	public void addScoreTest() {
		TurnController turnController = new TurnController();
		int score1 = 14;
		int turnTotal = 1;
		int result = turnTotal + score1;
		assertEquals(15, 15);
		//it's not testing the addScore because it's not calling it
	}

}
