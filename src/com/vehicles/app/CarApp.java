package com.vehicles.app;
import com.vehicles.Car;
import com.vehicles.parts.Engine;
public class CarApp {

	public static void main(String[] args) {
		Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Fortuner");
        car.setPrice(35000.00);

        Engine engine = new Engine();
        engine.setEngineType("Diesel");
        engine.setHorsepower(200);

        car.showCarDetails();
        System.out.println();
        engine.showEngineDetails();
	}

}
