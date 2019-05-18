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
	//PLEASE READ THIS BEFORE RUNNING TEST
	//Enter Y for first prompt and N for second prompt
	
	
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
	//test to see if there was a successful roll by checking if the last roll for the dice is greater than zero
	public void rollTest () throws Exception {
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		
		turncontroller.roll();

		assertEquals(true, turn.getDice().getLast().getLastRoll()>0);
	}
	

	
	@Test 
	public void checkSkunkTest () throws Exception {
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		turncontroller.checkSkunk("Double Skunk");
		assertEquals(0, turn.getTurnTotal());
		
	}
	
	@Test 
	public void checkSkunkTest2 () throws Exception {
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		turncontroller.checkSkunk("Skunk Deuce");
		assertEquals(0, turn.getTurnTotal());
		
	}
	
	@Test 
	public void checkSkunkTest3 () throws Exception {
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		turncontroller.checkSkunk("Regular Skunk");
		assertEquals(0, turn.getTurnTotal());
		
	}
	
	//Enter 0
	@Test
	public void checkSkunkTest4 () throws Exception {
		Turn turn = new Turn ();
		TurnController turncontroller = new TurnController( turn);
		turn.getDice().add(new Dice());
		turn.getDice().get(0).roll();
		
		turncontroller.checkSkunk("Not Skunk");
		assertEquals(turn.getDice().get(0).getLastRoll(), turn.getTurnTotal());
		
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
		assertEquals(1, turn.getDice().size());
		
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
	
	
	//testing best set and get turnover
	@Test
	public void setTurnOverText () {
		
	TurnController turnController = new TurnController();
	
	turnController.setTurnOver(true);
	
	assertEquals(true, turnController.getTurnOver());
	
	}

}
