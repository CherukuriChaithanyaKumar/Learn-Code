package CalculatoroperationsObjective;
import java.util.Scanner;

public class CalculatorOperations {
	   
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        double firstNumber = sc.nextDouble();
	        
	        System.out.print("Enter operator (+, -, *, /): ");
	        String operator = sc.next();
	        
	        System.out.print("Enter second number: ");
	        double secondNumber = sc.nextDouble();

	        double result = 0; 

	        if (operator.equals("+")) {
	            result = firstNumber + secondNumber;
	        } 
	        else if (operator.equals("-")) {
	            result = firstNumber - secondNumber;
	        }
	        else if (operator.equals("*")) {
	            result = firstNumber * secondNumber;
	        }
	        else if (operator.equals("/")) {
	            if (secondNumber == 0) {
	                System.out.println("Error: Division by zero is not allowed.");
	                sc.close();
	                return; 
	            } 
	            else {
	                result = firstNumber / secondNumber;
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

