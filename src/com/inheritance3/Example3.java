package com.inheritance3;




class AudiCar{
	String tyers;
	String colurs;
	String brakes;
	Engine engine;
	public AudiCar(String tyers, String colurs, String brakes, Engine engine) {
		super();
		this.tyers = tyers;
		this.colurs = colurs;
		this.brakes = brakes;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "AudiCar [tyers=" + tyers + ", colurs=" + colurs + ", brakes=" + brakes + ", engine=" + engine + "]";
	}
	
	
	
	
	
	
	
	
	
	
}

class Engine{
	String capacity;
	String rpm;
	String fuelCapacity;
	public Engine(String capacity, String rpm, String fuelCapacity) {
		
		this.capacity = capacity;
		this.rpm= rpm;
		this.fuelCapacity = fuelCapacity;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", rpm=" + rpm + ", fuelCapacity=" + fuelCapacity + "]";
	}
	
	
	
	
}



public class Example3 {

	public static void main(String[] args) {
		Engine eng=new Engine("220", "120", "12ltr");
		
		AudiCar c=new AudiCar("MRF","red","disc",eng);
		System.out.println(c);

	}

}