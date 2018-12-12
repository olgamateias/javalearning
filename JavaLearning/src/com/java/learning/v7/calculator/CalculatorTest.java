package com.java.learning.v7.calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.verification.VerificationModeFactory;

public class CalculatorTest {

	private ICalculator calculator;
	
	@SuppressWarnings("unchecked")
	@Before
	public void setup() {
		this.calculator = mock(Calculator.class);
		when(this.calculator.add(anyDouble(), anyDouble())).thenCallRealMethod();
		when(this.calculator.substract(anyDouble(), anyDouble())).thenCallRealMethod();
		when(this.calculator.multiply(anyDouble(), anyDouble())).thenCallRealMethod();
		when(this.calculator.divide(anyDouble(), anyDouble())).thenCallRealMethod();
		when(this.calculator.addMultiple(anyList())).thenCallRealMethod();
		when(this.calculator.multiplyMultiple(anyList())).thenCallRealMethod();
	}
	
	@Test
	public void testAdd() {
		assertEquals(this.calculator.add(2, 4), 6);
	}
	
	@Test
	public void testSubstract() {
		assertEquals(this.calculator.substract(2, 4), -2);
		assertEquals(this.calculator.substract(4, 2), 2);
		assertEquals(this.calculator.substract(2, 2), 0);
	}
	
	@Test
	public void testMultiply() {
		assertEquals(this.calculator.multiply(2, 4), 8);
		assertEquals(this.calculator.multiply(-2, 4), -8);
		assertEquals(this.calculator.multiply(-2, -2), 4);
		assertEquals(this.calculator.multiply(2, 0), 0);
	}
	
	@Test
	public void testDivide() {
		assertEquals(this.calculator.divide(2, 4), 0.5);
		assertEquals(this.calculator.divide(4, 2), 2);
		assertThrows(IllegalArgumentException.class, () -> this.calculator.divide(4, 0), "Division by zero is not allowed");
	}
	
	@Test
	public void testAddMultiple() {
		assertEquals(this.calculator.addMultiple(Arrays.asList(2D, 4D, 5D)), 11D);
		verify(this.calculator, VerificationModeFactory.atLeast(1)).add(anyDouble(), anyDouble());
	}
	
	@Test
	public void testMultiplyMultiple() {
		assertEquals(this.calculator.multiplyMultiple(Arrays.asList(2D, 4D, 5D)), 40D);
		verify(this.calculator, VerificationModeFactory.atLeast(1)).multiply(anyDouble(), anyDouble());
	}
	
	
}
