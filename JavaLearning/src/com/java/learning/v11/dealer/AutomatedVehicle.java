package com.java.learning.v11.dealer;

public abstract class AutomatedVehicle extends NonAutomatedVehicle implements IAutomatedVehicle {

	private int maxSpeed;
	private String fuel;

	public AutomatedVehicle(int nrWheels, String fuel) {
		super(nrWheels);
		this.fuel = fuel;
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
