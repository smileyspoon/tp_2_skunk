package mainPackage;
import java.util.LinkedList;

public class Session {
	
	private LinkedList <Player> player = new LinkedList<Player>();

	
	Session (int numberOfPlayer) {
		
		createSession (numberOfPlayer);
		
	}

	
	private void createSession (int numberOfPlayer) {
		
		for (int i =0; i< numberOfPlayer; i++) {
			
			player.add(new Player(i+1));
			
		}
		
		
	}
	
	
}
