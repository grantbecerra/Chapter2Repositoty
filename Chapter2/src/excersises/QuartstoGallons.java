package excersises;

public class QuartstoGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int quartsinGallons = 4;
		
		int quartsNeeded = 18;
		int gallonsNeeded;
		int extraQuarts;
		
		gallonsNeeded = quartsNeeded / quartsinGallons;
		extraQuarts = quartsNeeded % quartsinGallons;
		
		
		System.out.println("You have" + gallonsNeeded + " gallons and " + extraQuarts + " quarts left over");
	}

}
