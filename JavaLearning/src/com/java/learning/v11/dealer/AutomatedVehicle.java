package com.java.learning.v11.dealer;

public abstract class AutomatedVehicle extends NonAutomatedVehicle implements IAutomatedVehicle {

	private int maxSpeed;
	private Fuel fuel;

	public AutomatedVehicle(int nrWheels, Fuel fuel) {
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
	public Fuel getFuel() {
		return this.fuel;
	}

	@Override
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

}
