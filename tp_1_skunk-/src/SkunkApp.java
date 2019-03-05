import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {

	public static void main(String[] args) {
		StdOut.println("This is main!");
		
		Dice dice1 = new Dice();
		

		StdOut.println("This is a test roll: " + dice1.getLastRoll());
		
		StdOut.println("This is the predictable test roll which will always roll 3 per die");
		
		Dice dice2 = new Dice(3);
		
		StdOut.println("This is a test roll: " + dice2.getLastRoll());
		
	}

}
