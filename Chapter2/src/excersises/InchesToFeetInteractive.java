package excersises;

import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int inchesInFeet = 12;
		
		int inchesNeeded;
		int feetNeeded;
		int extraInches;
		Scanner input = new Scanner (System.in);
		
		System.out.print(" Enter Inches needed>>>");
		inchesNeeded = input.nextInt();
		feetNeeded = inchesNeeded / inchesInFeet;
		extraInches = inchesNeeded % inchesInFeet;
		
		System.out.println("You have " + feetNeeded + " Feet and " + extraInches + " Inches left over ");
		
	}

}
