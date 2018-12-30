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

	// get dataBase
	public Map<String, List<INonAutomatedVehicle>> getVehicleDatabase() {
		return this.vehicleDatabase;
	}

	// add vehicle types
	public void addBicycle(Bicycle bike) {
		this.vehicleDatabase.get(BICYCLE).add(bike);
	}

	public void addTricycle(Tricycle tricycle) {
		this.vehicleDatabase.get(TRICYCLE).add(tricycle);
	}

	public void addMoto(Motorcycle moto) {
		this.vehicleDatabase.get(MOTORCYCLE).add(moto);
	}

	public void addCar(Car car) {
		this.vehicleDatabase.get(CAR).add(car);
	}

	// get the database for vehicle type - type passed as parameter
	public List<INonAutomatedVehicle> getVehiclesOfType(String vehicle) {
		List<INonAutomatedVehicle> vehicles = this.vehicleDatabase.get(vehicle);
		return vehicles;
	}

	// get the vehicles for fuel type - type passed as parameter
	public List<IAutomatedVehicle> getVehiclesOfFuelType(Fuel fuel) {
		List<IAutomatedVehicle> allVehiclesOfFuelType = new ArrayList<>();

//		for (INonAutomatedVehicle notAuto : this.vehicleDatabase.get(CAR)) {
//			IAutomatedVehicle auto = (IAutomatedVehicle) notAuto;
//			if (auto.getFuel().equals(fuel)) {
//				allVehiclesOfFuelType.add(auto);
//			}
//		}
//
//		for (INonAutomatedVehicle notAuto : this.vehicleDatabase.get(MOTORCYCLE)) {
//			IAutomatedVehicle auto = (IAutomatedVehicle) notAuto;
//			if (auto.getFuel().equals(fuel)) {
//				allVehiclesOfFuelType.add(auto);
//			}
//		}

		List<INonAutomatedVehicle> nonAuto = new ArrayList<>();
		nonAuto.addAll(this.vehicleDatabase.get(CAR));
		nonAuto.addAll(this.vehicleDatabase.get(MOTORCYCLE));
		for (INonAutomatedVehicle nonVehicle : nonAuto) {
			IAutomatedVehicle auto = (IAutomatedVehicle) nonVehicle;
			if (auto.getFuel().equals(fuel)) {
				allVehiclesOfFuelType.add(auto);
			}
		}
		return allVehiclesOfFuelType;
	}

	// get a map with vehicles for each fuel type
	public Map<Fuel, List<IAutomatedVehicle>> autoVehiclesMap() {

		Map<Fuel, List<IAutomatedVehicle>> autoVehicleMap = new HashMap<>();
		autoVehicleMap.put(Fuel.GAS, getVehiclesOfFuelType(Fuel.GAS));
		autoVehicleMap.put(Fuel.GASOLINE, getVehiclesOfFuelType(Fuel.GASOLINE));
		autoVehicleMap.put(Fuel.DIESEL, getVehiclesOfFuelType(Fuel.DIESEL));
		autoVehicleMap.put(Fuel.ELECTRIC, getVehiclesOfFuelType(Fuel.ELECTRIC));

		return autoVehicleMap;
	}

}
