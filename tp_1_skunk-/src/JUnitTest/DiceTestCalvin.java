package JUnitTest;
import static org.junit.Assert.*;
import mainPackage.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTestCalvin {

	private Dice dice;
	private int count =0;
	
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
		predictablRoll [count] = dice.getLastRoll();
		assertEquals("First value is 1", 2, predictablRoll [count]);
		count++;
		
		dice.roll();
		predictablRoll [count] = dice.getLastRoll();
		assertEquals("First value is 1", 4, predictablRoll [count]);
		count++;
		
		dice.roll();
		predictablRoll [count] = dice.getLastRoll();
		assertEquals("First value is 1", 6, predictablRoll [count]);
		count++;
		
		dice.roll();
		predictablRoll [count] = dice.getLastRoll();
		assertEquals("First value is 1", 8, predictablRoll [count]);
		count++;
		
		
	}
	
	
	

}