package com.inheritance3;
//Detailed Explanation
//In this scenario, we have a base class Vehicle that contains common properties and
//methods for all types of vehicles. The derived classes Car , Truck , and Motorcycle
//inherit from Vehicle and add their own specific properties and methods. The
//displayInfo() method in the base class is used to display common information, while
//each derived class has its own method to display additional details specific to that
//type of vehicle. This design allows us to maintain a common interface for all vehicles
//while still providing specific functionality for each type.
//Base Class: Vehicle
//Properties: make , model , year
//Methods:
//displayInfo() : Displays basic information about the vehicle.
//Derived Class: Car
//Properties: numberOfDoors
//Methods:
//displayCarInfo() : Displays information specific to cars.
//Derived Class: Truck
//Properties: cargoCapacity
//Methods:
//displayTruckInfo() : Displays information specific to trucks.
//Derived Class: Motorcycle
//Properties: hasSidecar
//Methods:
//displayMotorcycleInfo() : Displays information specific to motorcycles.
//Expected Input and Output
//Vehicle car = new Car("Toyota", "Corolla", 2022, 4);
//car.displayInfo(); // Calls the method from the base class
//((Car) car).displayCarInfo(); // Calls the method from the Car class
//// Expected Output:
//// Toyota Corolla 2022
//// Number of Doors: 4
//Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);
//truck.displayInfo(); // Calls the method from the base class
//((Truck) truck).displayTruckInfo(); // Calls the method from the Truck class
//// Expected Output:
//// Ford F-150 2021
//// Cargo Capacity: 1000 kg
//Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2023, true);
//motorcycle.displayInfo(); // Calls the method from the base class
//((Motorcycle) motorcycle).displayMotorcycleInfo(); // Calls the method from the
