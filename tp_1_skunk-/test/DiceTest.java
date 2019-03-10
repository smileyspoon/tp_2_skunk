import static org.junit.Assert.*;
import mainPackage.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {

	private Dice dice;

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int predictablRoll [] = {1,2,3,4} ;
		int predictablRoll2 [] = {1,2,3,4} ;
		
		dice = new Dice(predictablRoll, predictablRoll2);
		
		dice.roll();
		assertEquals("First value is 1", 2, dice.getLastRoll());
		
		dice.roll();
		assertEquals("First value is 1", 4, dice.getLastRoll());

		dice.roll();
		assertEquals("First value is 1", 6, dice.getLastRoll());
		
		dice.roll();
		assertEquals("First value is 1", 8, dice.getLastRoll());

		
	}
	
	
	

}