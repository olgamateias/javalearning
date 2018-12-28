package com.java.learning.v11.dealer;

public class AutomatedVehicle implements IAutomatedVehicle {

	private double weight;
	private int wheels;
	private double price;
	private int maxSpeed;
	private String fuel;

	public AutomatedVehicle(int wheels, String fuel) {
		super();
		this.wheels = wheels;
		this.fuel = fuel;
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
	public int getWheels() {
		return this.wheels;
	}

	@Override
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	@Override
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String getFuel() {
		return this.fuel;
	}

	@Override
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

}
