import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Round;
import mainPackage.Turn;

public class roundTest {
	
	Round round;
	LinkedList<Turn> turn = new LinkedList<Turn>();
	public int roundTotal = 0;

	
	@Before
	public void setUp() throws Exception {
		this.round = new Round();
	}
	

	@Test
	public void getRoundTotalTest() throws Exception {
		Round round = new Round();
		round.getRoundTotal();
	}
	
	@Test
	public void getTurnNumberTest() {
		LinkedList<Turn> turn = new LinkedList<Turn>();
		roundTotal = 0;
		round.getTurnNumber();
	}
	@Test
	public void getTurnTest() throws Exception {
		LinkedList<Turn> turn = new LinkedList<Turn>();
		round.getTurn();
	}
	
	public void newTurnTest() {
		LinkedList<Turn> turn = new LinkedList<Turn>();
		
	}

}
