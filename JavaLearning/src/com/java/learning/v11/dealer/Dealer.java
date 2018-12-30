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

	// get the car(s) with the highest speed
	public List<IAutomatedVehicle> highSpeedCar() {
		List<IAutomatedVehicle> highSpeedCar = getHighSpeedVehicle(CAR);
//		IAutomatedVehicle auto;
//		int maxSpeed = Integer.MIN_VALUE;
//		for (INonAutomatedVehicle vehicle : this.vehicleDatabase.get(CAR)) {
//			auto = (IAutomatedVehicle) vehicle;
//			if (auto.getMaxSpeed() > maxSpeed) {
//				maxSpeed = auto.getMaxSpeed();
//				highSpeedCar.clear();
//				highSpeedCar.add(auto);
//			} else if (auto.getMaxSpeed() == maxSpeed) {
//				highSpeedCar.add(auto);
//			}
//		}
//		for (INonAutomatedVehicle vehicle : this.vehicleDatabase.get(CAR)) {
//			auto = (IAutomatedVehicle) vehicle;
//			if (auto.getMaxSpeed() == maxSpeed) {
//				highSpeedCar.add(auto);
//			}
//		}

		return highSpeedCar;
	}

	// get the motorcycle(s) with the highest speed
	public List<IAutomatedVehicle> highSpeedMoto() {
		List<IAutomatedVehicle> highSpeedMoto = getHighSpeedVehicle(MOTORCYCLE);
//		int maxSpeed = Integer.MIN_VALUE;
//		for (INonAutomatedVehicle vehicle : this.vehicleDatabase.get(MOTORCYCLE)) {
//			IAutomatedVehicle auto = (IAutomatedVehicle) vehicle;
//			if (auto.getMaxSpeed() > maxSpeed) {
//				maxSpeed = auto.getMaxSpeed();
//				highSpeedMoto.clear();
//				highSpeedMoto.add(auto);
//			} else if (auto.getMaxSpeed() == maxSpeed) {
//				highSpeedMoto.add(auto);
//			}
//		}
		return highSpeedMoto;
	}

	private List<IAutomatedVehicle> getHighSpeedVehicle(String vehicleType) {
		List<IAutomatedVehicle> highSpeedVehicle = new ArrayList<>();
		int maxSpeed = Integer.MIN_VALUE;
		for (INonAutomatedVehicle vehicle : this.vehicleDatabase.get(vehicleType)) {
			IAutomatedVehicle auto = (IAutomatedVehicle) vehicle;
			if (auto.getMaxSpeed() > maxSpeed) {
				maxSpeed = auto.getMaxSpeed();
				highSpeedVehicle.clear();
				highSpeedVehicle.add(auto);
			} else if (auto.getMaxSpeed() == maxSpeed) {
				highSpeedVehicle.add(auto);
			}
		}
		return highSpeedVehicle;
	}

	// get a map with each vehicle type and the number of vehicles:
	// ex.: {CAR -> 2, MOTORCICLE - > 0, BICYCLE -> 10, TRICYCLE -> 3}
	public Map<String, Integer> getNrOfVehicleTypes() {
		Map<String, Integer> nrOfVehicleTypes = new HashMap<>();

		nrOfVehicleTypes.put(BICYCLE, this.vehicleDatabase.get(BICYCLE).size());
		nrOfVehicleTypes.put(TRICYCLE, this.vehicleDatabase.get(TRICYCLE).size());
		nrOfVehicleTypes.put(CAR, this.vehicleDatabase.get(CAR).size());
		nrOfVehicleTypes.put(MOTORCYCLE, this.vehicleDatabase.get(MOTORCYCLE).size());

		return nrOfVehicleTypes;
	}

	/*
	 * get a map with each fuel type and the number of vehicles:
	 * ex.: {GAS -> 2, GASOLINE -> 1, DIESEL -> 4, ELECTRIC -> 9}
	 */
	public Map<Fuel, Integer> getNrOfVehiclesOfFuelType() {
		Map<Fuel, Integer> nrOfVehiclesFuelType = new HashMap<>();

		nrOfVehiclesFuelType.put(Fuel.DIESEL, getVehiclesOfFuelType(Fuel.DIESEL).size());
		nrOfVehiclesFuelType.put(Fuel.ELECTRIC, getVehiclesOfFuelType(Fuel.ELECTRIC).size());
		nrOfVehiclesFuelType.put(Fuel.GAS, getVehiclesOfFuelType(Fuel.GAS).size());
		nrOfVehiclesFuelType.put(Fuel.GASOLINE, getVehiclesOfFuelType(Fuel.GASOLINE).size());

		return nrOfVehiclesFuelType;
	}

	// get the average number of wheels in the dealership :)
	public double getAvgNrWheels() {
		double avgNrWheels = 0;
		int nrWheels = 0;
		List<INonAutomatedVehicle> allVehicles = new ArrayList<>();
		allVehicles.addAll(this.vehicleDatabase.get(BICYCLE));
		allVehicles.addAll(this.vehicleDatabase.get(TRICYCLE));
		allVehicles.addAll(this.vehicleDatabase.get(CAR));
		allVehicles.addAll(this.vehicleDatabase.get(MOTORCYCLE));
		for (INonAutomatedVehicle vehicle : allVehicles) {
			nrWheels = nrWheels + vehicle.getNrWheels();
		}
		avgNrWheels = nrWheels / allVehicles.size();
		return avgNrWheels;
	}

	// - get the average number of seats for all the cars in the dealership
	public double getAvgNrOfSeats() {
		double avgNrOfSeats = 0;
		int nrSeats = 0;
		int nrOfCars = getNrOfVehicleTypes().get(CAR);
		for (INonAutomatedVehicle vehicle : this.vehicleDatabase.get(CAR)) {
			Car auto = (Car) vehicle;
			nrSeats = nrSeats + auto.getNrSeats();
		}
		avgNrOfSeats = nrSeats / nrOfCars;

		return avgNrOfSeats;
	}

	// - check if there is a car available in a color (return true or false) - color passed as
	// parameter
	public boolean hasColor(String color) {
		for (INonAutomatedVehicle vehicle : this.vehicleDatabase.get(CAR)) {
			Car car = (Car) vehicle;
			if (car.getColor().equals(color)) {
				return true;
			}
		}
		return false;
	}
}
