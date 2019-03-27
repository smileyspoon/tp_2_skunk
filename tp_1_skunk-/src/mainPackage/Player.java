package mainPackage;

import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Player {
	
	private LinkedList <Turn> turn = new LinkedList<Turn>();
	
	private String name;
	private int score;	
	
	Player (int playerNumber ) 
	{		
		StdOut.println("What is player " + playerNumber +"'s name?");
		
		StdIn.readLine();
		name = StdIn.readString();
		
		this.setName(name);		
	}
	
	public void newTurn () 
	{		
		turn.add(new Turn());
	}

	public String getName() 
	{
		return name;
	}	

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getScore() 
	{
		return score;
	}

	public void setScore(int score) 
	{
		this.score = score;
	}
	
	public int getTurnNumber () 
	{		
		return (turn.size()+1);
	}
}
