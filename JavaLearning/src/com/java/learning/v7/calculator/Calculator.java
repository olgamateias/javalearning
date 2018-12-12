package com.java.learning.v7.calculator;

import java.util.List;

public class Calculator implements ICalculator{

	public Calculator() {
		// 
	}

	@Override
	public double add(double a, double b) {
		return 0;
	}

	@Override
	public double substract(double a, double b) {
		return 0;
	}

	@Override
	public double multiply(double a, double b) {
		return 0;
	}

	/* 
	 * When b is zero you need to throw an exception
	 */
	@Override
	public double divide(double a, double b) throws IllegalArgumentException {
		return 0;
	}

	/* 
	 * You must call add method
	 */
	@Override
	public double addMultiple(List<Double> list) {
		return 0;
	}

	/* 
	 * You must call multiply method
	 */
	@Override
	public double multiplyMultiple(List<Double> list) {
		return 0;
	}

}
