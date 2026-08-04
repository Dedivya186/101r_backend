package com.constraturchaining;
 
class Vehicle{
	public   void  describe() {
		System.out.println("This is vehicle");
	}
}
public class Car extends Vehicle {
	public   void  describe() {
		
		System.out.println("This is a car");
		super.describe();
	}
	public static void main(String[] args) {
		
      Car c= new Car();
      c.describe();
	}

}
