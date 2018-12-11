package com.java.learning.v1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class TestersMathStuff {

	@Test
	void testEvenNumbers() {
		assertEvenNumber(22, true);
		assertEvenNumber(-2, true);
		assertEvenNumber(0, true);
		assertEvenNumber(101, false);
		assertEvenNumber(-23, false);
	}

	@Test
	void testOddNumbers() {
		assertOddNumber(101, true);
		assertOddNumber(-23, true);
		assertOddNumber(22, false);
		assertOddNumber(-2, false);
		assertOddNumber(0, false);
	}

	@Test
	void testPrimeNumbers() {
		assertPrimeNumber(2, true);
		assertPrimeNumber(7, true);
		assertPrimeNumber(101, true);
		assertPrimeNumber(4, false);
		assertPrimeNumber(99, false);
		assertPrimeNumber(0, false);
		assertPrimeNumber(-1, false);
	}

	@Test
	void testDivisors() {
		assertIterableEquals(Arrays.asList(1, 2, 3, 6), MathStuff.getDivisors(6));
		assertIterableEquals(Arrays.asList(1, 2), MathStuff.getDivisors(2));
		assertIterableEquals(Arrays.asList(1, 3, 7, 21), MathStuff.getDivisors(21));
		assertIterableEquals(Arrays.asList(1, 2, 4, 5, 10, 20, 25, 50, 100), MathStuff.getDivisors(100));
		assertIterableEquals(Collections.emptyList(), MathStuff.getDivisors(0));
		assertIterableEquals(Collections.emptyList(), MathStuff.getDivisors(-1));
	}

	@Test
	void testFibonacciSequence() {
		assertIterableEquals(Arrays.asList(1, 1),MathStuff.displayFibonacciSequence(2));
		assertIterableEquals(Arrays.asList(1, 1, 2),MathStuff.displayFibonacciSequence(3));
		assertIterableEquals(Arrays.asList(1, 1, 2, 3, 5, 8),MathStuff.displayFibonacciSequence(6));
		assertIterableEquals(Collections.emptyList(),MathStuff.displayFibonacciSequence(0));
		assertIterableEquals(Collections.emptyList(),MathStuff.displayFibonacciSequence(-1));
	}

	private void assertEvenNumber(int number, boolean result) {
		assertEquals(result, MathStuff.isEven(number),  number + " is not even");
	}

	private void assertOddNumber(int number, boolean result) {
		assertEquals(result, MathStuff.isOdd(number),  number + " is not odd");
	}

	private void assertPrimeNumber(int number, boolean result) {
		assertEquals(result, MathStuff.isPrime(number), number + " is not prime");
	}
}
