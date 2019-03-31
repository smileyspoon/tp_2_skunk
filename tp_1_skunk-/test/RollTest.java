import static org.junit.Assert.*;
import mainPackage.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.Assert;

public class RollTest {

	private Dice dice;
	private String rollResult;
	
	@Before
	public void setUp() throws Exception 
	{
		int predictablRoll1 [] = {1,2,1,5,1} ;
		int predictablRoll2 [] = {1,1,2,1,5} ;
		dice = new Dice(predictablRoll1, predictablRoll2);
		
	}

	@After
	public void tearDown() throws Exception 
	{
	}


	
	@Test
	public void doubleSkunk() 
	{
		dice.roll();
		Roll roll = new Roll(dice);
		rollResult= roll.getRollResult();
		assertEquals("", "Double Skunk", roll.getRollResult());		
	}
	
	@Test
	public void skunkDuce() 
	{
		dice.roll();
		dice.roll();
		Roll roll = new Roll(dice);
		rollResult= roll.getRollResult();
		assertEquals("", "Skunk Duce", roll.getRollResult());		
	}
	
	@Test
	public void skunkDuce2() 
	{
		dice.roll();
		dice.roll();
		dice.roll();
		Roll roll = new Roll(dice);
		rollResult= roll.getRollResult();
		assertEquals("", "Skunk Duce", roll.getRollResult());		
	}
	
	@Test
	public void regularSkunk() 
	{
		dice.roll();
		dice.roll();
		dice.roll();
		dice.roll();
		Roll roll = new Roll(dice);
		rollResult= roll.getRollResult();
		assertEquals("", "Regular Skunk", roll.getRollResult());		
	}
	
	@Test
	public void regularSkunk2() 
	{
		dice.roll();
		dice.roll();
		dice.roll();
		dice.roll();
		dice.roll();
		Roll roll = new Roll(dice);
		rollResult= roll.getRollResult();
		assertEquals("", "Regular Skunk", roll.getRollResult());		
	}
	
	

}