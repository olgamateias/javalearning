package com.java.learning.v11.dealer;

public interface IDealer {

	/*
	 * A dealer will sell vehicles of all types: bicycles, tricycles, motorcycles, cars (gas,
	 * gasoline, diesel, electric).
	 * Bicycles and tricycles are non-automated vehicles while motorcycles and cars are
	 * autovehicles.
	 * 
	 * The properties required for each vehicle are:
	 * 
	 * Bicycle: weight, number of wheels, price. Contructor: number of wheels
	 * Tricycle: weight, number of wheels, price. Contructor: number of wheels
	 * Motorcycle: weight, number of wheels, price, max-speed, fuel. Contructor: number of wheels,
	 * fuel
	 * Car: weight, number of wheels, price, max-speed, fuel, number of seats, color. Contructor:
	 * number of wheels, fuel
	 * 
	 * The fuel property will be of type enum and will have the following values: GAS, GASOLINE,
	 * DIESEL, ELECTRIC
	 * 
	 * The dealer will have a database (Map<String, List<?>>) that stores each vehicle. The key of
	 * the map is defined by 4 constants (public static final) of type String that will represent
	 * the type of vehicle. The constants are defined in Dealer class.
	 * 
	 * Define the classes/interfaces necessary to store the vehicles sold by the dealer. Think about
	 * what properties/methods are common to which classes and extract interfaces/abstract classes
	 * that define/implement the common behaviour.
	 * 
	 * 
	 * - get the database
	 * - add car/motorcycle/bicycle/tricycle
	 * - get the database for vehicle type - type passed as parameter
	 * - get the vehicles for fuel type - type passed as parameter
	 * - get a map with vehicles for each fuel type
	 * - get the car(s) with the highest speed
	 * - get the motorcycle(s) with the highest speed
	 * - get a map with each vehicle type and the number of vehicles:
	 * ex.: {CAR -> 2, MOTORCICLE - > 0, BICYCLE -> 10, TRICYCLE -> 3}
	 * - get a map with each fuel type and the number of vehicles:
	 * ex.: {GAS -> 2, GASOLINE -> 1, DIESEL -> 4, ELECTRIC -> 9}
	 * - get the average number of wheels in the dealership :)
	 * - get the average number of seats for all the cars in the dealership
	 * - check if there is a car available in a color (return true or false) - color passed as
	 * parameter
	 * 
	 */
}
