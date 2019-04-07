import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import mainPackage.Dice;
import mainPackage.Die;
import mainPackage.Round;
import mainPackage.Turn;
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
	//enter Y
	public void startTurnTest () throws Exception {
		
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		turncontroller.startTurn(turn);
		assertEquals(turn.getTurnTotal(), turncontroller.getTotalScore());
		
	}
	
	@Test 
	public void checkSkunkTest () throws Exception {
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		turncontroller.checkSkunk("Double Skunk");
		assertEquals(0, turncontroller.getTotalScore());
		
	}
	
	@Test 
	public void checkSkunkTest2 () throws Exception {
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		turncontroller.checkSkunk("Skunk Duce");
		assertEquals(0, turncontroller.getTotalScore());
		
	}
	
	@Test 
	public void checkSkunkTest3 () throws Exception {
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		turncontroller.checkSkunk("Regular Skunk");
		assertEquals(0, turncontroller.getTotalScore());
		
	}
	
	//Enter 0
	@Test
	public void checkSkunkTest4 () throws Exception {
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		turncontroller.getDice().add(new Dice());
		turncontroller.getDice().get(0).roll();
		
		turncontroller.checkSkunk("Not Skunk");
		assertEquals(turncontroller.getDice().get(0).getLastRoll(), turncontroller.getTotalScore());
		
	}
	
	@Test
	(expected=Exception.class)
	public void checkSkunkTest5() throws Exception 
	{
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		turncontroller.checkSkunk("asdf");
		
	}
	
	
	


	@Test
	public void rollnewDiceTest() {
		
//		int counter =0;
//		dice.roll();
//		assertEquals("First roll is 3", 3, dice.getLastRoll());
//		
//		TurnController.rollNewDice();
//		assertEquals("Checking",3);
		Turn turn = new Turn ();
		
		TurnController turncontroller = new TurnController( turn);
		
		turncontroller.rollNewDice();
		assertEquals(1, turncontroller.dice.size());
		
	}
	
	@Test
	public void addScoreTest() {
		TurnController turnController = new TurnController();
		turnController.addScore(15);
		assertEquals(15, 15);
		//it's not testing the addScore because it's not calling it
	}
	
	
	//Here is the example we talked about
	@Test
	public void exampleForLinkedList() throws Exception {
	LinkedList<Dice> dice = new LinkedList<Dice>();	
	
	dice.add(new Dice ());
	dice.add(new Dice ());
	
	dice.get(0).roll();
	dice.get(1).roll();
	
	LinkedList<Round> round = new LinkedList<Round>();
	
	round.add(new Round());

		
		
	}

}
