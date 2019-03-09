package mainPackage;
public class Die
{
	private int lastRoll;
	private boolean testableDie = false;
	private int dieRoll;
	private int [] predictablRoll;
	private int count =0;

	public Die()
	{
		this.roll();
	}

	public Die (int number)
	{
		testableDie = true;
		this.dieRoll = number;
	}
	
	public Die (int [] predictablRoll ) {
		
		testableDie= true;
		this.predictablRoll = predictablRoll;
	}


	public int getLastRoll() // getter or accessor method
	{

		return this.lastRoll;
	}

	public void roll() // note how this changes Die's state, but doesn't return anything
	{
		if(!testableDie) {
			this.lastRoll = (int) (Math.random() * 6 + 1);
		} else {
			this.lastRoll = this.predictablRoll[count];
			count++;
		}
	}
	
	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "Die: " + this.getLastRoll();
	}
}