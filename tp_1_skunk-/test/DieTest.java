import static org.junit.Assert.*;
import mainPackage.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieTest {
	
	private Die die;
	
	@Before
	public void setUp() throws Exception 
	{
		int predictablRoll [] = {1,2,3,4} ; //predictablRoll has a value of 1-4 array
		die = new Die(predictablRoll); //initialize new die
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	@Test
	public void testRoll1ofPredictableDie() 
	{
		die.roll();
		assertEquals("First roll is not 1", 1, die.getLastRoll());
	}
		
	@Test
	public void testRoll2ofPredictableDie() 
	{
		die.roll();
		die.roll();
		assertEquals("Second roll is not 2", 2, die.getLastRoll());
	}
	
	@Test
	public void testRoll3ofPredictableDie() 
	{
		die.roll();
		die.roll();
		die.roll();
		assertEquals("Third roll is not 3", 3, die.getLastRoll());
	}
	
	@Test
	public void testRoll4ofPredictableDie() 
	{
		die.roll();
		die.roll();
		die.roll();
		die.roll();
		assertEquals("Fourth roll is not 4", 4, die.getLastRoll());
	}
	
	@Test
	public void testRoll5ofPredictableDieWith4Init() 
	{
		die.roll();
		die.roll();
		die.roll();
		die.roll();
		die.roll();
		assertEquals("Fifth roll is not 1", 1, die.getLastRoll());
	}
	
	@Test(expected=RuntimeException.class)
	public void testNullDieArray()
	{
		Die die = new Die(null);
		die.roll();
	}
	
	@Test(expected=RuntimeException.class)
	public void testDieValueLessThan1() 
	{
		int predictablRoll [] = {0} ;
		die = new Die(predictablRoll);
		die.roll();
	}
	
	@Test(expected=RuntimeException.class)
	public void testDieValueMoreThan6() 
	{
		int predictablRoll [] = {7} ;
		die = new Die(predictablRoll);
		die.roll();
	}
}