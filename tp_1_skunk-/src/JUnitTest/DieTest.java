package JUnitTest;
import static org.junit.Assert.*;
import mainPackage.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieTest {

	private Die die;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		die = new Die(1);
		die.roll();
		int value = die.getLastRoll();
		assertEquals("First value not 1", 1, value);
	}
	
	@Test
	public void test2() {
		die = new Die(1);
		die.roll();
		int value = die.getLastRoll();
		assertEquals("First value not 1", 1, value);
	}
	
	@Test
	public void test3() {
		die = new Die(1); // this should make it fail (TDD) - fix before submission
		die.roll();
		int value = die.getLastRoll();
		assertEquals("First value not 2", 2, value);
	}
	
	@Test
	public void test4() {
		die = new Die(3);
		die.roll();
		int value = die.getLastRoll();
		assertEquals("First value not 3", 3, value);
	}

}