import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {

	Die die1;
	Die die2;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRollOf3() {
		die1 = new Die(1); // this roll will fail (TDD) - fix before submission
		die2 = new Die(1);
		die1.roll();
		die2.roll();
		int value = die1.getLastRoll() + die2.getLastRoll();
		assertEquals("Value not 3", 3, value);
	}
}