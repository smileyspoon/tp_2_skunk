import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTestCalvin {

	private Dice dice;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		dice = new Dice(5,3);
		
		int value = dice.getLastRoll();
		assertEquals("First value is 8", 8, value);
	}
	
	public void test2() {
		dice = new Dice(1,1);
		
		int value = dice.getLastRoll();
		assertEquals("First value is 2", 2, value);
	}
	
	public void test3() {
		dice = new Dice(1,3);
		
		int value = dice.getLastRoll();
		assertEquals("First value is 4", 4, value);
	}
	
	public void test4() {
		dice = new Dice(2,3);
		
		int value = dice.getLastRoll();
		assertEquals("First value is 5", 5, value);
	}
	
	
	

}