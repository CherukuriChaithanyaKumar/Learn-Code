package CalculatoroperationsProcedural;

import java.util.Scanner;

public class CalculatorApp {
	public static double add(double firstNumber, double secondNumber ) {
		return firstNumber + secondNumber;
	}

	public static double subtract(double fisrtNumber, double secondNumber) {
		return fisrtNumber - secondNumber;
	}

	public static double multiply(double fisrtNumber, double secondNumber) {
		return fisrtNumber * secondNumber;
	}

	public static double divide(double firstNumber , double secondNumber) {
		if (secondNumber == 0) {
			System.out.println("Error: Division by zero is not allowed.");
			return Double.NaN;
		}
		return firstNumber / secondNumber;
	}

	public static double percentage(double firstNumber, double secondNumber) {
		return (firstNumber * secondNumber) / 100;
	}

	public static double squareRoot(double firstNumber) {
		if (firstNumber < 0) {
			System.out.println("Error: Square root of a negative number is not allowed.");
			return Double.NaN;
		}
		return firstNumber;
	}

	public static double cube(double firstNumber) {
		return firstNumber * firstNumber * firstNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter first number: ");
		double firstNumber = sc.nextDouble();

		System.out.print("Select an operation\n" + "1. Addition\n" + "2. Substraction\n" + "3. Multiplication\n"
				+ "4. Division\n" + "5. Percentage\n" + "6. Squareroot\n" + "7. Cube");
		int operation = sc.nextInt();

		double result = 0;

		if (operation == 1) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = add(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 2) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = subtract(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 3) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = multiply(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 4) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = divide(firstNumber, secondNumber);
			if (!Double.isNaN(result)) {
				System.out.print(result);
			}
		} else if (operation == 5) {
			System.out.print("Enter the percentage value: ");
			double secondNumber = sc.nextDouble();
			result = percentage(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 6) {
			result = squareRoot(firstNumber);
			if (!Double.isNaN(result)) {
				System.out.print(result);
			}
		} else if (operation == 7) {
			result = cube(firstNumber);
			System.out.print(result);
		} else {
			System.out.println("Invalid operation! Please try again with a valid operator.");
		}

		sc.close();
	}

}
package CalculatoroperationsProcedural;

import java.util.Scanner;

public class CalculatorApp {
	public static double add(double firstNumber, double secondNumber ) {
		return firstNumber + secondNumber;
	}

	public static double subtract(double fisrtNumber, double secondNumber) {
		return fisrtNumber - secondNumber;
	}

	public static double multiply(double fisrtNumber, double secondNumber) {
		return fisrtNumber * secondNumber;
	}

	public static double divide(double firstNumber , double secondNumber) {
		if (secondNumber == 0) {
			System.out.println("Error: Division by zero is not allowed.");
			return Double.NaN;
		}
		return firstNumber / secondNumber;
	}

	public static double percentage(double firstNumber, double secondNumber) {
		return (firstNumber * secondNumber) / 100;
	}

	public static double squareRoot(double firstNumber) {
		if (firstNumber < 0) {
			System.out.println("Error: Square root of a negative number is not allowed.");
			return Double.NaN;
		}
		return firstNumber;
	}

	public static double cube(double firstNumber) {
		return firstNumber * firstNumber * firstNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter first number: ");
		double firstNumber = sc.nextDouble();

		System.out.print("Select an operation\n" + "1. Addition\n" + "2. Substraction\n" + "3. Multiplication\n"
				+ "4. Division\n" + "5. Percentage\n" + "6. Squareroot\n" + "7. Cube");
		int operation = sc.nextInt();

		double result = 0;

		if (operation == 1) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = add(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 2) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = subtract(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 3) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = multiply(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 4) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = divide(firstNumber, secondNumber);
			if (!Double.isNaN(result)) {
				System.out.print(result);
			}
		} else if (operation == 5) {
			System.out.print("Enter the percentage value: ");
			double secondNumber = sc.nextDouble();
			result = percentage(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 6) {
			result = squareRoot(firstNumber);
			if (!Double.isNaN(result)) {
				System.out.print(result);
			}
		} else if (operation == 7) {
			result = cube(firstNumber);
			System.out.print(result);
		} else {
			System.out.println("Invalid operation! Please try again with a valid operator.");
		}

		sc.close();
	}

}
package CalculatoroperationsProcedural;

import java.util.Scanner;

public class CalculatorApp {
	public static double add(double firstNumber, double secondNumber ) {
		return firstNumber + secondNumber;
	}

	public static double subtract(double fisrtNumber, double secondNumber) {
		return fisrtNumber - secondNumber;
	}

	public static double multiply(double fisrtNumber, double secondNumber) {
		return fisrtNumber * secondNumber;
	}

	public static double divide(double firstNumber , double secondNumber) {
		if (secondNumber == 0) {
			System.out.println("Error: Division by zero is not allowed.");
			return Double.NaN;
		}
		return firstNumber / secondNumber;
	}

	public static double percentage(double firstNumber, double secondNumber) {
		return (firstNumber * secondNumber) / 100;
	}

	public static double squareRoot(double firstNumber) {
		if (firstNumber < 0) {
			System.out.println("Error: Square root of a negative number is not allowed.");
			return Double.NaN;
		}
		return firstNumber;
	}

	public static double cube(double firstNumber) {
		return firstNumber * firstNumber * firstNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter first number: ");
		double firstNumber = sc.nextDouble();

		System.out.print("Select an operation\n" + "1. Addition\n" + "2. Substraction\n" + "3. Multiplication\n"
				+ "4. Division\n" + "5. Percentage\n" + "6. Squareroot\n" + "7. Cube");
		int operation = sc.nextInt();

		double result = 0;

		if (operation == 1) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = add(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 2) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = subtract(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 3) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = multiply(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 4) {
			System.out.print("Enter second number: ");
			double secondNumber = sc.nextDouble();
			result = divide(firstNumber, secondNumber);
			if (!Double.isNaN(result)) {
				System.out.print(result);
			}
		} else if (operation == 5) {
			System.out.print("Enter the percentage value: ");
			double secondNumber = sc.nextDouble();
			result = percentage(firstNumber, secondNumber);
			System.out.print(result);
		} else if (operation == 6) {
			result = squareRoot(firstNumber);
			if (!Double.isNaN(result)) {
				System.out.print(result);
			}
		} else if (operation == 7) {
			result = cube(firstNumber);
			System.out.print(result);
		} else {
			System.out.println("Invalid operation! Please try again with a valid operator.");
		}

		sc.close();
	}

}
