package CalculatoroperationsObjective;

public class SquareRoot implements perform{

	public double performOperation(double firstNumber) {
		if (firstNumber < 0) {
			System.out.println("Error: Square root of a negative number is not allowed.");
			return Double.NaN;
		}
		double guess = firstNumber / 2.0;
		double tolerance = 0.0001;
		while (Math.abs(guess * guess - firstNumber) > tolerance) {
			guess = (guess + firstNumber / guess) / 2.0;
		}
		return guess;
	}
}
