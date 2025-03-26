package CalculatoroperationsObjective;

import java.util.Scanner;

public class CalculatorOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = sc.nextDouble();

        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Percent");
        System.out.println("6. Square Root");
        System.out.println("7. Cube");

        int operationChoice = sc.nextInt();
		double secondNumber;
        switch (operationChoice) {
            case 1:
                System.out.println("Enter second number:");
                secondNumber = sc.nextDouble();
                Addition addition = new Addition();
                System.out.println(addition.performOperation(firstNumber, secondNumber));
                break;

            case 2:
                System.out.println("Enter second number:");
                secondNumber = sc.nextDouble();
                Subtraction subtraction = new Subtraction();
                System.out.println(subtraction.performOperation(firstNumber, secondNumber));
                break;

            case 3:
                System.out.println("Enter second number:");
                secondNumber = sc.nextDouble();
                Multiplication multiplication = new Multiplication();
                System.out.println(multiplication.performOperation(firstNumber, secondNumber));
                break;

            case 4:
                System.out.println("Enter second number:");
                secondNumber = sc.nextDouble();
                Division division = new Division();
                System.out.println(division.performOperation(firstNumber, secondNumber));
                break;

            case 5:
                System.out.println("Enter second number:");
                secondNumber = sc.nextDouble();
                Percent percent = new Percent();
                System.out.println(percent.performOperation(firstNumber, secondNumber));
                break;

            case 6:
                SquareRoot squareRoot = new SquareRoot();
                System.out.println(squareRoot.performOperation(firstNumber));
                break;

            case 7:
                Cube cube = new Cube();
                System.out.println(cube.performOperation(firstNumber));
                break;

            default:
                System.out.println("Invalid operation! Please try again with a valid operation.");
                break;
        }

        sc.close();
    }
}

