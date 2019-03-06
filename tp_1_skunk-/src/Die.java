import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;

public class Die
{
	private int lastRoll;

	public Die()
	{
		this.roll();
	}
	
	public Die (int number)
	{
		
		this.roll(number);
	}

	public int getLastRoll() // getter or accessor method
	{

		return this.lastRoll;
	}

	public void roll() // note how this changes Die's state, but doesn't return anything
	{

		this.lastRoll = (int) (Math.random() * 6 + 1);
	}
	
	public void roll (int number) {
		lastRoll = number;	
	}
	
	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "Die: " + this.getLastRoll();
	}
	


}
