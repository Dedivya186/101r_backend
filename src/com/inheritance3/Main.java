package com.inheritance3;

class Vehicle {
    String make;
    String model;
    int year;
	public Vehicle(String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println("make:"+this.make);
		System.out.println("model:"+this.model);
	    System.out.println("year:"+this.year);
	}
   
}
class Car extends Vehicle {
	int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	public void displayCarInfo() {
		System.out.println("make:"+super.make);
		System.out.println("model:"+super.model);
	    System.out.println("year:"+super.year);
	    System.out.println("numberOfDoors:"+this.numberOfDoors);
	}
}
class Truck extends Vehicle{
	int cargoCapacity;

	public Truck(String make, String model, int year, int cargoCapacity) {
		super(make, model, year);
		this.cargoCapacity = cargoCapacity;
	}
	public void displayTruckInfo() {
		System.out.println("make:"+super.make);
		System.out.println("model:"+super.model);
	    System.out.println("year:"+super.year);
	    System.out.println("cargoCapacity;"+this.cargoCapacity);
	}
}
class motorCycle extends Vehicle{
	boolean hasSidecar;

	
	public motorCycle(String make, String model, int year, boolean hasSidecar) {
		super(make, model, year);
		this.hasSidecar = hasSidecar;
	}


	public void displayMotorCycleInfo() {
		System.out.println("make:"+super.make);
		System.out.println("model:"+super.model);
	    System.out.println("year:"+super.year);
	    System.out.println("hasSidecar:"+this.hasSidecar);
	}
}
public class Main {
	public static void main(String[] args) {
	Vehicle car = new Car("Toyota", "Corolla", 2022, 4);
	car.displayInfo();
	System.out.println("---------------------");
	 ((Car) car).displayCarInfo();
	 System.out.println("---------------------");
	Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);
	truck.displayInfo();
	System.out.println("---------------------");
	((Truck) truck).displayTruckInfo();
	 System.out.println("---------------------");

	Vehicle motorcycle = new motorCycle("Harley-Davidson", "Street Glide", 2023, true);
	motorcycle.displayInfo();
	System.out.println("---------------------");
	((motorCycle) motorcycle).displayMotorCycleInfo();
	}
}
