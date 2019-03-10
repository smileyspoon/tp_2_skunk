package mainPackage;
public class Die
{
	private int lastRoll;
	private boolean testableDie = false;
	private int [] predictablRoll;
	private int count =0;

	public Die()
	{
	}
	
	public Die (int [] predictablRoll) 
	{
		if(predictablRoll == null)
		{
			throw new RuntimeException("null initializing int [] array");
		}
		
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
			if((this.predictablRoll[count] < 1) ||
					(this.predictablRoll[count] > 6))
			{
				throw new RuntimeException("int [] array initialized with value other than 1,2,3,4,5,6");
			}
			this.lastRoll = this.predictablRoll[count];
			count++;
			if(count >= this.predictablRoll.length)
			{
				count = 0;
			}
		}
	}
}