// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		// user enters a number (any digit number)
		int n = Integer.parseInt(args[0]);
		// system prints num of hundreds, tens, ones
		System.out.println(n/100 + " hundreds, " + Math.floorMod(n, 100)/10 + " tens, and " + Math.floorMod(n, 10) + " ones.");
	}
}
