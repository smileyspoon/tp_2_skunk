import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Dice;
import mainPackage.Round;
import mainPackage.Turn;

public class TurnTest {

	public Turn turn;
	public int turnTotal = 0;
	public LinkedList<Dice> dice = new LinkedList<Dice>();
	public boolean doubleSkunk = false;
	private Turn Turn;
	private Object skunk;


	@Before
	public void setUp() throws Exception {
		this.turn= new Turn();
	}

	@Test
	public void getTurnTotalTest() {
		LinkedList<Dice> dice = new LinkedList<Dice>();
		turnTotal= 0;
		turn.getTurnTotal();
	}
	@Test
	public void getDoubleSkunk() {
		
		
	}
	@Test
	public void getDiceTest() throws Exception {
		LinkedList<Dice> dice = new LinkedList<Dice>();	
		
		dice.add(new Dice ());
		dice.add(new Dice ());
	
		dice.get(0).roll();
		dice.get(1).roll();
		
		LinkedList<Round> round = new LinkedList<Round>();
		
		round.add(new Round());
		turn.getDice();
	}
}
