package com.java.learning.v11.dealer;

public class Car extends AutomatedVehicle {

	private int nrSeats;
	private String color;

	public Car(int wheels, Fuel fuel) {
		super(wheels, fuel);
	}

	public int getNrSeats() {
		return this.nrSeats;
	}

	public void setNrSeats(int nrSeats) {
		this.nrSeats = nrSeats;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
