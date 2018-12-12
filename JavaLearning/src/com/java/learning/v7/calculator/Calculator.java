package com.java.learning.v7.calculator;

import java.util.List;

public class Calculator implements ICalculator{

	public Calculator() {
		// 
	}

	@Override
	public double add(double a, double b) {
		double sum = a + b;
		return sum;
	}

	@Override
	public double substract(double a, double b) {
		double result = a - b;
		return result;
	}

	@Override
	public double multiply(double a, double b) {
		double result = a * b;
		return result;
	}

	/* 
	 * When b is zero you need to throw an exception
	 */
	@Override
	public double divide(double a, double b) throws IllegalArgumentException {
		double result = 0;
		IllegalArgumentException message = new IllegalArgumentException("b cannot be 0 (zero)!");

		
		if(b == 0) {
			throw message;
		} else {
			result = a / b;
		}
		return result;
	}

	/* 
	 * You must call add method
	 */
	@Override
	public double addMultiple(List<Double> list) {
		double sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum = add(sum, list.get(i));
		}
		return sum;
	}

	/* 
	 * You must call multiply method
	 */
	@Override
	public double multiplyMultiple(List<Double> list) {
		double result = 1;
		for(int i = 0; i < list.size(); i++) {
			result = multiply(result, list.get(i));
		}
		return result;
	}

}
