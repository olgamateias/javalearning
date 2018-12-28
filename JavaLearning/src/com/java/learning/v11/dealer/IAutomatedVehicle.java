package com.java.learning.v11.dealer;

public interface IAutomatedVehicle extends INonAutomatedVehicle {

	void setFuel(Fuel fuel);

	Fuel getFuel();

	void setMaxSpeed(int maxSpeed);

	int getMaxSpeed();

}
