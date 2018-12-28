package com.java.learning.v11.dealer;

public interface IAutomatedVehicle extends INonAutomatedVehicle {

	void setFuel(String fuel);

	String getFuel();

	void setMaxSpeed(int maxSpeed);

	int getMaxSpeed();

}
