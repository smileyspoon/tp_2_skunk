package mainPackage;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {

	private static int numberOfPlayer;
	
	public static void main(String[] args) {
		
		StdOut.println("Welcome to the Skunk game!!!");
		StdOut.println("How many players");
		
		numberOfPlayer = StdIn.readInt();
		
		Session session = new Session (numberOfPlayer);
		

}
}