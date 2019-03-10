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
		int predictablRoll [] = {1,2,3,4} ; //predictablRoll has a value of 1-4 array
		
		die = new Die(predictablRoll); //initialize new die
		
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
	
	@Test
	public void test_roll_2_of_predictable_die()
	{
		Die die = new Die(new int [] {3,2,1});
		die.getLastRoll();
		assertEquals("First value not 3",3, die.getLastRoll());
		die.roll();
		assertEquals("second value not 2", 2, die.getLastRoll());
	}
	
	
	

}