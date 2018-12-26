package com.java.learning.v02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TestersMathStuff2 {

	@Test
	void testMax() {
		assertEquals(5, MathStuff2.findMax(Arrays.asList(3, 5, 1, -2)));
		assertEquals(-15, MathStuff2.findMax(Arrays.asList(-23, -15, -100, -29)));
		assertEquals(0, MathStuff2.findMax(Arrays.asList(0)));
		assertEquals(1, MathStuff2.findMax(Arrays.asList(1, 1, 1)));
	}

	@Test
	void testAverage() {
		assertEquals(4, MathStuff2.calculateAverage(Arrays.asList(2, 4, 6)));
		assertEquals(1, MathStuff2.calculateAverage(Arrays.asList(1, 1, 1)));
		assertEquals(roundDouble(36.3333), roundDouble(MathStuff2.calculateAverage(Arrays.asList(5, 41, 63))));
		assertEquals(-2, MathStuff2.calculateAverage(Arrays.asList(-2, 2, -6)));
		assertEquals(2, MathStuff2.calculateAverage(Arrays.asList(2)));
	}

	@Test
	void testSum() {
		assertEquals(21, MathStuff2.calculateSum(Arrays.asList(1, 2, 3, 4, 5, 6)));
		assertEquals(-21, MathStuff2.calculateSum(Arrays.asList(-1, -2, -3, -4, -5, -6)));
		assertEquals(9, MathStuff2.calculateSum(Arrays.asList(-1, -2, -3, 4, 5, 6)));
		assertEquals(2, MathStuff2.calculateSum(Arrays.asList(2)));
	}

	@Test
	void testCommonDivisors() {
		assertIterableEquals(Arrays.asList(1), MathStuff2.findComonDivisors(Arrays.asList(1, 2, 3)));
		assertIterableEquals(Arrays.asList(1, 3, 9), MathStuff2.findComonDivisors(Arrays.asList(9, 27, 81)));
		assertIterableEquals(Arrays.asList(1), MathStuff2.findComonDivisors(Arrays.asList(4, 8, 9, 21)));
		assertIterableEquals(Arrays.asList(1, 3), MathStuff2.findComonDivisors(Arrays.asList(3)));
	}

	@Test
	void testMaxDivisor() {
		assertEquals(9, MathStuff2.findMaxDivisor(Arrays.asList(9, 27, 36)));
		assertEquals(18, MathStuff2.findMaxDivisor(Arrays.asList(18, 36, 72)));
		assertEquals(3, MathStuff2.findMaxDivisor(Arrays.asList(9, 21, 36)));
		assertEquals(9, MathStuff2.findMaxDivisor(Arrays.asList(9)));
	}

	@Test
	void testRoundDouble() {
		assertEquals(3.56d, roundDouble(3.5578));
		assertEquals(3.50d, roundDouble(3.501));
		assertEquals(3.33d, roundDouble(3.333333));
	}

	private double roundDouble(double number) {
		return new BigDecimal(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

}
