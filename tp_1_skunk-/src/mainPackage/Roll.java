package mainPackage;

public class Roll {

	/*
	 * 1+1 Double Skunk: double skunk lose roll, lose turn score, lose roll score
	 * 
	 * 1+2, 2+1 Skunk Duce: lose roll score
	 * 
	 * 1+ * Regular Skunk: lose roll;
	 * 
	 */

	private String rollResult="";
	private boolean skunk = false;
	
	Roll(Dice dice) {
		
		if (skunk==false) {
			
			setRollResult(doubleSkunk(dice));
			skunk = true;
			
		}
		
		else if (skunk==false) {
			
			setRollResult(skunkDuce(dice));
			skunk = true;
		}
		
		else if (skunk == false) {
			
			setRollResult(regularSkunk(dice));
			skunk = true;
		}
		
		else {
			
			setRollResult("Not Skunk");
		}
		

	}

	public String doubleSkunk(Dice dice) {

		return "Double Skunk";

	}

	public String skunkDuce(Dice dice) {

		return "Skunk Duce";

	}

	public String regularSkunk(Dice dice) {

		return "Regular Skunk";

	}

	public String getRollResult() {
		return rollResult;
	}

	private void setRollResult(String rollResult) {
		this.rollResult = rollResult;
	}

}
