import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import mainPackage.Player;

public class playerTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void setNameTest() throws Exception {
		Player player = new Player(1);
		String name ="Sheila";
		player.setName(name);
		assertEquals(name, player.getName());
	}
	
	@Test
	public void getScoreTest() throws Exception {
		Player player = new Player(1);
		player.setScore(15);
		assertEquals(15, player.getScore());
	}
	
	@Test
	public void getChipsTest() throws Exception {
		Player player = new Player(1);
		int chips = 50;
		player.setChips(chips);
		assertEquals (100, player.getChips());
						
	}
}
