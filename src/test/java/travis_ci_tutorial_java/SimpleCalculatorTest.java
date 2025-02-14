package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testAddTrue() {
		SimpleCalculator calc = new SimpleCalculator();
		assertTrue(calc.add(5, 5) == 10);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);
	}
	
	@Test
	public void testMultiplyByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 0), 0);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(10, 2), 5);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivideByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(5, 0), 0);
	}
}
