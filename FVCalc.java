// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// user enters Current value, Rate, Number of years
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		// creating a new double value which stands for the future value after the rate increase and using the given formula
		// [Current Value * (1 + Rate)^Number of years]
		double futureValue = currentValue * Math.pow((double)(1+rate/100.0),(double)(n));
		// printing out the old value, current rate and future yield
		System.out.println("After " + n + " years, a $" + currentValue + " saved at " + (double)rate + "% will yield $" + (int)futureValue);


		
	}
}