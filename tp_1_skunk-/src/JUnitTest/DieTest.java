package JUnitTest;
import static org.junit.Assert.*;
import mainPackage.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieTest {

	private Die die;
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
		
		die = new Die(predictablRoll);
		
		die.roll();
		assertEquals("First value is 1", 1, predictablRoll [count]);
		count++;
		
		die.roll();
		assertEquals("First value is 2", 2, predictablRoll [count]);
		count++;
		
		die.roll();
		assertEquals("First value is 3", 3, predictablRoll [count]);
		count++;
		
		die.roll();
		assertEquals("First value is 4", 4, predictablRoll [count]);
		count++;
		
		
	}
	
	
	

}