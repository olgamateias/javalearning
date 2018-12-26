package com.java.learning.v07.calculator;

import java.util.List;

public interface ICalculator {

	public double add(double a, double b);
	
	public double substract(double a, double b);
	
	public double multiply(double a, double b);
	
	public double divide(double a, double b) throws IllegalArgumentException;
	
	public double addMultiple(List<Double> list);
	
	public double multiplyMultiple(List<Double> list);
	
	
}
