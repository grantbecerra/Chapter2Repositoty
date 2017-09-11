package excersises;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int inchesInFeet = 12;
		
		int inchesNeeded = 86;
		int feetNeeded;
		int extraInches;
		
		feetNeeded = inchesNeeded / inchesInFeet;
		extraInches = inchesNeeded % inchesInFeet;
		
		System.out.println("You have " + feetNeeded + " Feet and " + extraInches + " Inches left over ");
		
	}

}
