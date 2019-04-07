import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Dice;
import mainPackage.Roll;

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