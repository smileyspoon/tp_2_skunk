package mainPackage;
import java.util.LinkedList;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Turn {
	
	private int counter =0;
	private boolean turnOver = false;
	private LinkedList <Dice> dice = new LinkedList <Dice>();
	private int turnTotal =0;
	private String question;
	
	Turn () {
		
		StdOut.println("This is the start of your turn");
		
		while (turnOver==false) {
		
		dice.add(new Dice());
		dice.get(counter).roll();

		
		StdOut.println("You rolled " +dice.get(counter).getLastRoll());
		StdOut.println("Would you like to go again? Y/N");
		question = StdIn.readString();
		
			if (question.equals("N") || question.equals("n")) {
				
				turnOver =true;
			}
		
			counter++;
	}
		
		StdOut.println("You rolled: ");
		
		for (int i =0; i<counter; i++) {
			
			StdOut.println ("Roll " + (i+1) + ":  " + dice.get(i).getLastRoll());
			
			turnTotal = turnTotal+dice.get(i).getLastRoll();
		}
		
		StdOut.println("Your dice roll total is:  "+  turnTotal);
		
		
		

}
	
	
	public int getTurnTotal () {
		
		return turnTotal;
	}
	
	public LinkedList<Dice> getDice() {
		
		return dice;
	}
	
	
	
}

