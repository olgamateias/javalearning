package com.java.learning.v6.onlineshop;

public class Product implements IProduct {

	private String name = "";
	private double price = 0;

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		try {
			name.equals(null);
		} catch (Exception e) {
			name = "";
			System.out.println("The name of the product is null");
		}

		this.name = name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

}
