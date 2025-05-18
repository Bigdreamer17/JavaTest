package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAppTest {
	@Test
    void testAdd() {
        assertEquals(15.0, CalculatorApp.add(10, 5), "Addition should return the sum of two numbers");
    }

    @Test
    void testSubtract() {
        assertEquals(5.0, CalculatorApp.subtract(10, 5), "Subtraction should return the difference between two numbers");
    }

    @Test
    void testMultiply() {
        assertEquals(50.0, CalculatorApp.multiply(10, 5), "Multiplication should return the product of two numbers");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, CalculatorApp.divide(10, 5), "Division should return the quotient of two numbers");
    }

    @Test
    void testDivideByZero() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> {
            CalculatorApp.divide(10, 0);
        }, "Expected divide by zero to throw ArithmeticException");
        
        assertEquals("Cannot divide by zero", thrown.getMessage());
    }
}
