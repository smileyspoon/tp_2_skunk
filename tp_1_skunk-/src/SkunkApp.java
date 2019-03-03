import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {

	public static void main(String[] args) {
		StdOut.println("This is main!");
		
		Dice dice1 = new Dice();
		
		dice1.roll();
		StdOut.println("This is a test roll: " + dice1.getLastRoll());
		
	}

}
