// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// user enters a limit for the randomizer
		int lim = Integer.parseInt(args[0]);
		// system randomizes 3 different numbers
		int n1 = (int)(Math.random() * (double)lim + 1.0);
		int n2 = (int)(Math.random() * (double)lim + 1.0);
		int n3 = (int)(Math.random() * (double)lim + 1.0);
		// system prints the numbers in a "random" order
		// system prints the numbers in an increasing orders
		System.out.println(n1 + " " + n2 + " " + n3);
		// checking which are the 2 biggest numbers
		int temp1 = Math.max(n1,n2);
		int temp2 = Math.max(n2,n3);
		int temp3 = Math.max(n1,n3);
		// printing numbers in an an increasing order
		System.out.println(Math.min(n1, Math.min(n2,n3)) + " " + Math.min(temp1, Math.min(temp2,temp3)) + " " + Math.max(n1, Math.max(n2,n3)));
	}
}
