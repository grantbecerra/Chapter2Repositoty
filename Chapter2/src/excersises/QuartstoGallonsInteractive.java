package excersises;

import java.util.Scanner;

public class QuartstoGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int quartsInGallons = 4;
		
		int quartsNeeded = 2;
		int gallonsNeeded;
		int extraQuarts;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter quarts needed>>>");
		gallonsNeeded = quartsNeeded / quartsInGallons;
		extraQuarts = quartsNeeded % quartsInGallons;
		
		
		System.out.println("You have" + gallonsNeeded + " gallons and " + extraQuarts + " quarts left over");
	}

}
