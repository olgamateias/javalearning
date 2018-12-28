package com.java.learning.v11.dealer;

public abstract class NonAutomatedVehicle implements INonAutomatedVehicle {

	private double weight;
	private int nrWheels;
	private double price;

	public NonAutomatedVehicle(int nrWheels) {
		this.nrWheels = nrWheels;
	}

	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int getNrWheels() {
		return this.nrWheels;
	}

	@Override
	public void setNrWheels(int nrWheels) {
		this.nrWheels = nrWheels;
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
