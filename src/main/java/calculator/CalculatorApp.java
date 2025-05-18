package calculator;

public class CalculatorApp {
	// Addition function
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction function
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication function
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division function
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
	public static void main(String[] Args) {
		double num1 = 10;
        double num2 = 5;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
	}

}
