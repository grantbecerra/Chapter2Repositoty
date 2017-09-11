package youDoIt;

import java.util.Scanner;

public class page84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter your name>> ");
	name = input.nextLine();
	System.out.print("Please enter an integer>> ");
	anInt = input.nextInt();
	System.out.print("Please enter a byte integer>> ");
	aByte = input.nextByte();
	System.out.print("Please enter a short integer>> ");
	aShort = input.nextShort();
	System.out.print("Please enter a long integer>> ");
	aLong = input.nextLong();
	 
	System.out.print("Please enter your name>> ");
	
	System.out.println("the int is" + anInt);
	System.out.println("the byte is" + aByte);
	System.out.println("the short is" + aShort);
	System.out.println("the long is" + aLong);
	System.out.println("Thank you" + name);
	}

}
