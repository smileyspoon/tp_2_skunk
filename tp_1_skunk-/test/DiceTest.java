import static org.junit.Assert.*;
import mainPackage.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.Assert;

public class DiceTest {

	private Dice dice;
	
	@Before
	public void setUp() throws Exception 
	{
		int predictablRoll1 [] = {1,3,5} ;
		int predictablRoll2 [] = {2,4,6} ;
		dice = new Dice(predictablRoll1, predictablRoll2);
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	@Test
	public void testRoll1ofPredictableDice() 
	{
		dice.roll();
		assertEquals("First roll is 3", 3, dice.getLastRoll());		
	}
	
	@Test
	public void testRoll2ofPredictableDice() 
	{
		dice.roll();
		dice.roll();
		assertEquals("First roll is 7", 7, dice.getLastRoll());		
	}
	
	@Test
	public void testRoll3ofPredictableDice() 
	{
		dice.roll();
		dice.roll();
		dice.roll();
		assertEquals("First roll is 11", 11, dice.getLastRoll());		
	}
	
	@Test
	public void testRoll4ofPredictableDiceWith3RollsInit() 
	{
		dice.roll();
		dice.roll();
		dice.roll();
		dice.roll();
		assertEquals("First roll is 3", 3, dice.getLastRoll());		
	}
	
	@Test(expected=RuntimeException.class)
	public void testNullDiceArray()
	{
		Dice dice = new Dice(null, null);
		dice.roll();
	}
	
	@Test(expected=RuntimeException.class)
	public void testDiceValueLessThan1() 
	{
		int predictablRoll1 [] = {0} ;
		int predictablRoll2 [] = {3} ;
		dice = new Dice(predictablRoll1, predictablRoll2);
		dice.roll();

	}
	
	@Test(expected=RuntimeException.class)
	public void testDiceValueMoreThan6() 
	{
		int predictablRoll1 [] = {7} ;
		int predictablRoll2 [] = {90} ;
		dice = new Dice(predictablRoll1, predictablRoll2);
		dice.roll();
	}
	
	@Test
	public void testToString() {
		
		//created new string object
		String value = new String();
		String expected = ""; //expected string value
		dice.roll();
		assertEquals("Dice with last roll: 3 => 1 + 2",dice.toString());
		assertEquals(expected, value.toString());
	} 
	
	@Test
	public void randomTest() {
	  dice = new Dice();
	  dice.roll();
	  
	  assertTrue("Error, dice value is too high", dice.getLastRoll() <= 12);
	  assertTrue("Error, dice value is too low",  dice.getLastRoll() >= 2);
	}
	
	@Test
	public void getDie1Test() {
	  dice = new Dice();
	  dice.roll();
	  
	  assertTrue("Error, die value is too high", dice.getDie1() <= 6);
	  assertTrue("Error, die value is too low",  dice.getDie1() >= 1);
	}
	
	@Test
	public void getDie2Test() {
	  dice = new Dice();
	  dice.roll();
	  
	  assertTrue("Error, die value is too high", dice.getDie2() <= 6);
	  assertTrue("Error, die value is too low",  dice.getDie2() >= 1);
	}
}