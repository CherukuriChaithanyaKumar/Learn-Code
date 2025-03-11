package CalculatoroperationsObjective;

class Division implements operation {
    public double performOperation(double firstNumber, double secondNumber) {
    	
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}
