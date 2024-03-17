package SolarCalculator;
import java.util.Scanner;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }


public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // enter two integer values
    System.out.print("Enter the first integer: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Enter the second integer: ");
    int secondNumber = scanner.nextInt();

    scanner.close();

    Calculator calculator = new Calculator();
    int sumResult = calculator.sum(firstNumber, secondNumber);
    int subtractResult = calculator.subtract(firstNumber, secondNumber);
    int multiplyResult = calculator.multiply(firstNumber, secondNumber);
    int divideResult = calculator.divide(firstNumber, secondNumber);

    // Print the results
    System.out.println("Sum: " + sumResult);
    System.out.println("Subtract: " + subtractResult);
    System.out.println("Multiply: " + multiplyResult);
    System.out.println("Divide: " + divideResult);
}
}