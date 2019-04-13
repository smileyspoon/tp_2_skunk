import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Round;
import mainPackage.Turn;

public class roundTest {
	

	LinkedList<Turn> turn = new LinkedList<Turn>();
	public int roundTotal = 0;

	
	@Before
	public void setUp() throws Exception {

	}
	

	@Test
	public void getRoundTotalTest() throws Exception {
		Round round = new Round();
		round.setRoundTotal(15);
		assertEquals(15,round.getRoundTotal());

	}
	
	@Test
	public void getTurnNumberTest() throws Exception {
		Round round = new Round();
		round.newTurn();
		round.newTurn();
		assertEquals(3,round.getTurnNumber());
	}
	@Test
	public void getTurnTest() throws Exception {
		Round round = new Round();
		round.newTurn();
		round.newTurn();
		assertEquals(3,round.getTurn().size());
	}
	@Test
	public void setTurnTest() throws Exception {
		Round round = new Round();
		
		LinkedList<Turn> turn = new LinkedList<Turn> ();
		turn.add(new Turn());
		round.setTurn(turn);
		round.getCurrentTurn().setDoubleSkunk(true);
		assertEquals(true, round.getCurrentTurn().getDoubleSknuk());
	}
	
	@Test
	public void getCurrentTurnTest() throws Exception {
		Round round = new Round();
		
		round.newTurn();
		round.getCurrentTurn().setDoubleSkunk(false);
		round.newTurn();
		round.getCurrentTurn().setDoubleSkunk(true);
		
		assertEquals(true,round.getCurrentTurn().getDoubleSknuk());
		
	}

}
