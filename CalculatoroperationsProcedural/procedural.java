package CalculatoroperationsProcedural;

import java.util.Scanner;

public class procedural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double num1 = sc.nextDouble();

		System.out.print("Enter operator (+, -, *, /): ");
		String operation = sc.next();

		System.out.print("Enter second number: ");
		double num2 = sc.nextDouble();

		double result = 0;

		if (operation.equals("+"))
			result = num1 + num2;
		else if (operation.equals("-"))
			result = num1 - num2;
		else if (operation.equals("*"))
			result = num1 * num2;
		else if (operation.equals("/")) {
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Error: Division by zero is not allowed.");
				sc.close();
				return;
			}
		} else {
			System.out.println("Invalid operator!");
			sc.close();
			return;
		}

		System.out.println("Result: " + result);

		sc.close();
	}
}
