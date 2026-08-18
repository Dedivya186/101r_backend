package com.sample;

import java.util.Scanner;

class Plane{
	public void fly() {
		System.out.println("Plane");
	}
}
class CargoPlane extends Plane{
	public void fly() {
		System.out.println("CargoPlane is flying at low heights.");
	}
}
class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("PassengerPlane is flying at medium high");
	}
}
class FighterPlane extends Plane{
	public void fly() {
		System.out.println("FighterPlane is flying at great  high");
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Plane=sc.nextLine().toLowerCase();
		if(Plane.equals("cargoplane")) {
			CargoPlane c=new CargoPlane();
		
			c.fly();
		}
		else if(Plane.equals("passengerplane")) {
			PassengerPlane p=new PassengerPlane();
		    p.fly();
		}
		else if(Plane.equals("fighterplane")) {
			FighterPlane f=new FighterPlane();
		    f.fly();
		}

	}

}
