package mainPackage;
import java.util.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Session {
	
	private LinkedList <Player> player = new LinkedList<Player>();
	private boolean gameCompleted =false;
	private String continuePlay;
	private int numberOfPlayer;
	

	
	Session (int numberOfPlayer) {
		
		this.numberOfPlayer =numberOfPlayer;
		
		createPlayer (numberOfPlayer);
		
		startPlaying( );
		
	}

	
	private void createPlayer (int numberOfPlayer) {
		
		for (int i =0; i< numberOfPlayer; i++) {
			
			player.add(new Player(i+1));
			
		}
		
		
	}
	
	public LinkedList<Player> getPlayer () {
		
		return player;
		
	}
	
	private void startPlaying( ) {
		
		
		while (gameCompleted ==false) {
			
			
			for (int i =0; i <this.numberOfPlayer; i++) {
				
				StdOut.println("It's turn " + player.get(i).getTurnNumber() +" for player " + player.get(i).getName());
				player.get(i).newTurn();
				StdOut.println("Continue playing the game? Y/N");
				
				continuePlay = StdIn.readString();
				
				if (continuePlay.equals("N") || continuePlay.equals("n")) {
					
					gameCompleted= true;
				}
			}
			
			
		}
		
	}
	
	
}
