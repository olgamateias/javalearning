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
	 */
}
