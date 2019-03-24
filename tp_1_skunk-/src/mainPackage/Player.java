package mainPackage;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Player {
	
	private String name;
	
	Player (int playerNumber ) {
		
		StdOut.println("What is player " + playerNumber +"'s name?");
		
		StdIn.readLine();
		name = StdIn.readString();

		
		this.setName(name);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
