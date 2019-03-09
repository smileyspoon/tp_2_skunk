package mainPackage;
import static org.junit.Assert.assertEquals;

import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {

	public static void main(String[] args) {
		
		Dice dice1 = new Dice();	
		dice1.roll();
		StdOut.println("This is a random roll: " + dice1.getLastRoll());
		
		int predictablRoll [] = {1,2,3,4} ;
		int predictablRoll2 [] = {1,2,3,4} ;
		Dice dice2 = new Dice(predictablRoll, predictablRoll2);
		
		dice2.roll();
		StdOut.println("This is a  predictable roll 1: " + dice2.getLastRoll());
		
		dice2.roll();
		StdOut.println("This is a predictable rol 2: " + dice2.getLastRoll());
		
		dice2.roll();
		StdOut.println("This is a predictable rol 3: " + dice2.getLastRoll());
		
		dice2.roll();
		StdOut.println("This is a predictable rol 4: " + dice2.getLastRoll());

}
}