import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class playerTest {
	
	private String player1;
	private String player2;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

//	@Before
//	public void setUp() throws Exception {
//		this.player1=new Player();
//		this.player2= new Player("New Player");
//	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void setNameTest() {
		this.player1.setNameTest("Sheila");
		assertEquals(this.getNameTest(), "Sheila");
	}
	
	@Test
	public void getNameTest() {
		assertEquals(this.getName(), "Sheila");
	}
	
	@Test
	public void getScoreTest() {
		
	}
	
	@Test
	public void setScoreTest() {
		
	}
	
	@Test
	public void getGame() {
		
	}
	
	@Test
	public void setGame() {
		
	}

}
