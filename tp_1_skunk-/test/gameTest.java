import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;
import mainPackage.Game;
import mainPackage.Round;

public class gameTest {
	LinkedList<Round> round;	
	Game roundLL;
	Game game;
	
	@Before
	public void setUp() throws Exception
	{
		this.game = new Game();
	}

	@Test
	public void roundLinkedListTest() {
		Game roundLL = new Game();
		assertTrue(roundLL.isEmpty());
		
	}
	
	@Test
	public void newRoundTest() {
	//Need to complete
		
	}
	
	@Test
	public void getRoundTest()
	{
		System.out.println("getRoundTest");
		LinkedList<Round> round = new LinkedList<Round>();
		round.add("Hello");
		round.add(1);
		round.add("Sheila");
		round.add(2);
		
		assertEquals(,"1");
	}

}
