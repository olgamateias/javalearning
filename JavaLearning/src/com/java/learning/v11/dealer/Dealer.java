package com.java.learning.v11.dealer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dealer implements IDealer {

	public static final String BICYCLE = "bicycle";
	public static final String TRICYCLE = "tricycle";
	public static final String MOTORCYCLE = "motorcycle";
	public static final String CAR = "car";

	Map<String, List<INonAutomatedVehicle>> vehicleDatabase = new HashMap<>();

	// initializam mapulcu listele goale, in constructor
	public Dealer() {
		this.vehicleDatabase.put(BICYCLE, new ArrayList<>());
		this.vehicleDatabase.put(TRICYCLE, new ArrayList<>());
		this.vehicleDatabase.put(MOTORCYCLE, new ArrayList<>());
		this.vehicleDatabase.put(CAR, new ArrayList<>());
	}

}
