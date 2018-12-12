package com.java.learning.v6.onlineshop;

public class Product implements IProduct {
	
	private String name;
	private double price;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
