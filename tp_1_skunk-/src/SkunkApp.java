import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {

	public static void main(String[] args) {
		
		Dice dice1 = new Dice();		
		StdOut.println("This is a test roll: " + dice1.getLastRoll());
		
		Dice dice2 = new Dice(3,2);
		StdOut.println("This is a test roll of 5: " + dice2.getLastRoll());
		Dice dice3 = new Dice(4,2);		
		StdOut.println("This is a test roll of 6: " + dice3.getLastRoll());
		Dice dice4 = new Dice(3,4);		
		StdOut.println("This is a test roll of 7: " + dice4.getLastRoll());
		Dice dice5 = new Dice(5,6);		
		StdOut.println("This is a test roll of 11: " + dice5.getLastRoll());	
	}
}
