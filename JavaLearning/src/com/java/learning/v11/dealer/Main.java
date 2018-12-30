package com.java.learning.v11.dealer;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		Bicycle bike3 = new Bicycle();

		Tricycle tricycle1 = new Tricycle();
		Tricycle tricycle2 = new Tricycle();
		Tricycle tricycle3 = new Tricycle();

		Car car1 = new Car(4, Fuel.DIESEL);
		Car car2 = new Car(4, Fuel.ELECTRIC);
		Car car3 = new Car(4, Fuel.GAS);
		Car car4 = new Car(4, Fuel.GASOLINE);

		car1.setColor("red");
		car2.setColor("blue");
		car3.setColor("black");
		car4.setColor("red");

		car1.setMaxSpeed(200);
		car2.setMaxSpeed(180);
		car3.setMaxSpeed(200);
		car4.setMaxSpeed(250);

		car1.setNrSeats(5);
		car2.setNrSeats(8);
		car3.setNrSeats(5);
		car4.setNrSeats(2);

		car1.setPrice(35000);
		car2.setPrice(24999.99);
		car3.setPrice(36499.90);
		car4.setPrice(51900);

		Motorcycle moto1 = new Motorcycle(2, Fuel.DIESEL);
		Motorcycle moto2 = new Motorcycle(2, Fuel.ELECTRIC);
		Motorcycle moto3 = new Motorcycle(3, Fuel.GAS);
		Motorcycle moto4 = new Motorcycle(2, Fuel.GASOLINE);

		moto1.setMaxSpeed(220);
		moto2.setMaxSpeed(180);
		moto3.setMaxSpeed(220);
		moto4.setMaxSpeed(180);

		moto1.setPrice(25000);
		moto2.setPrice(18899.90);
		moto3.setPrice(14900.90);
		moto4.setPrice(12378.54);

		IDealer dealer = new Dealer();

		dealer.addBicycle(bike1);
		dealer.addBicycle(bike2);
		dealer.addBicycle(bike3);

		dealer.addTricycle(tricycle1);
		dealer.addTricycle(tricycle2);
		dealer.addTricycle(tricycle3);

		dealer.addCar(car1);
		dealer.addCar(car2);
		dealer.addCar(car3);
		dealer.addCar(car4);

		dealer.addMoto(moto1);
		dealer.addMoto(moto2);
		dealer.addMoto(moto3);
		dealer.addMoto(moto4);

		System.out.println("dealer's DB " + dealer.getVehicleDatabase());
		System.out.println("dealer map " + dealer.autoVehiclesMap());

		System.out.println("avg nr of seats " + dealer.getAvgNrOfSeats());
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("avg nr of wheels " + df.format(dealer.getAvgNrWheels()));
		System.out.println("nr of vehicle of each fuel type " + dealer.getNrOfVehiclesOfFuelType());

		dealer.getVehiclesOfFuelType(Fuel.DIESEL);
		dealer.getVehiclesOfFuelType(Fuel.ELECTRIC);
		dealer.getVehiclesOfFuelType(Fuel.GAS);
		dealer.getVehiclesOfFuelType(Fuel.GASOLINE);

		dealer.getVehiclesOfType(Dealer.BICYCLE);
		dealer.getVehiclesOfType(Dealer.CAR);
		dealer.getVehiclesOfType(Dealer.MOTORCYCLE);
		dealer.getVehiclesOfType(Dealer.TRICYCLE);

		System.out.println("hasColor red " + dealer.hasColor("red"));
		System.out.println("fastest car " + dealer.highSpeedCar());
		System.out.println("fastest moto " + dealer.highSpeedMoto());
	}

}
