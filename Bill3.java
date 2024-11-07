// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// user enters all three names of diners
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		// user enters bill sum
		int bill = Integer.parseInt(args[3]);
		// shifting the bill sum from Integer to double
		double split = (double)bill/3;
		// system prints all three names and rounded up sum of bill for each diner
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + Math.ceil(split) + " Shekels each");

	
	}
}
