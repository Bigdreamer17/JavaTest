package calculator;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;


public class CalculatorAppTest {
	CalculatorApp SciCalculator;
	
	
	@BeforeEach
	public void setup() {
		SciCalculator = new CalculatorApp();
		System.out.println("Setup Complete");
	}
//	
	@AfterEach
	public void teardown() {
		System.out.println("Teardown after test.");
	}
	
//	static CalculatorApp SciCalculator;
//	
//	@BeforeAll
//	public static void setUpAll() {
//		System.out.println("Welcome to the Scientific Calculator Test");
//	}
//	
//	@AfterAll
//	public static void tearDownAll() {
//		System.out.println("All Tests completed. GoodBye!!!");
//	}
	
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
    
    @Test
    void testNegativeBySqrt() {
    	assertThrows(IllegalArgumentException.class, () -> {
            CalculatorApp.sqrt(-4);
        }, "Expected Negative  square root to throw IllegalArgumentException");
    }
    
    @Test
    @Disabled("Factorial Method Not implemented Yet")
    void testFactorial() {
    	CalculatorApp SciCalculator = new CalculatorApp();
    	
    	int result = CalculatorApp.factorial(5);
    }
}
