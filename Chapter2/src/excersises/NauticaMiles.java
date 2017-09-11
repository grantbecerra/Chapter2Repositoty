package excersises;

import java.util.Scanner;

public class NauticaMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double kilometersInANauticalMile = 1.852;
		final double NauticalMilesInAKilometer = 1.150779;
		
		double kilometersNeeded;
		double nauticalMilesNeeded;
		double extraNauticalMiles;
		double extraKilometers;
		Scanner input = new Scanner (System.in);
		
		System.out.print(" Enter killometers needed>>>");
		kilometersNeeded = input.nextInt();
		nauticalMilesNeeded = kilometersNeeded / kilometersInANauticalMile;
		extraKilometers = kilometersNeeded % kilometersInANauticalMile;
		
		System.out.println("You have" + nauticalMilesNeeded + " nautical miles and" + extraKilometers + " kilometers left over");
		
		
		
		
		
	}

}
