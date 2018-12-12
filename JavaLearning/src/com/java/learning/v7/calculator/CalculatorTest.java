package com.java.learning.v7.calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private ICalculator calculator;
	
	@Before
	public void setup() {
		this.calculator = new Calculator();
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
	}
	
	@Test
	public void testAddMultiple() {
		assertEquals(this.calculator.addMultiple(Arrays.asList(2D, 4D, 5D)), 11D);
	}
	
	@Test
	public void testMultiplyMultiple() {
		assertEquals(this.calculator.multiplyMultiple(Arrays.asList(2D, 4D, 5D)), 40D);
	}
	
	
}
