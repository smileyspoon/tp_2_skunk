package mainPackage;

public class Roll {

	/*
	 * 1+1 Double Skunk: double skunk lose turn and accumulated round score, lose 4 chips
	 * 
	 * 1+2, 2+1 Skunk Duce: lose turn, lose current turn score, lose 2 chips
	 * 
	 * 1+ * Regular Skunk: lose turn, lose current turn score, lose 1 chip
	 * 
	 */

	private String rollResult="";

	
	public Roll(Dice dice) {
		

		if (doubleSkunk(dice) != null) {
			
			setRollResult(doubleSkunk(dice));
		}
		
		else if (skunkDuce(dice) != null) {
			
			setRollResult(skunkDuce(dice));
		}
		
		else if (regularSkunk(dice)!= null) {
			
			
			setRollResult(regularSkunk(dice));
		}
		
		else {
	
			setRollResult("Not Skunk");
		}
			
		
		

	}

	public String doubleSkunk(Dice dice) {
		
		if (dice.getDie1() ==1 && dice.getDie2() ==1) {


		return "Double Skunk";
		}
		
		else {
			return null;
		}

	}

	public String skunkDuce(Dice dice) {
		
		if ((dice.getDie1() ==1 && dice.getDie2() ==2) || (dice.getDie1() ==2 && dice.getDie2() ==1)) {


			return "Skunk Duce";
		}
		
		else {
			return null;
		}

	}

	public String regularSkunk(Dice dice) {

		if (dice.getDie1() ==1 || dice.getDie2() ==1) {

			return "Regular Skunk";

		}
		
		else {
			
			return null;
		}
	}

	public String getRollResult() {
		return rollResult;
	}

	private void setRollResult(String rollResult) {
		this.rollResult = rollResult;
	}
	

		
	}


