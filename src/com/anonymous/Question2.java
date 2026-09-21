package com.anonymous;
import java.util.function.Function;
class SensorData{
	private double temperature;
	private double humidity;
	public SensorData(double temperature, double humidity) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
}
public class Question2 {

	public static void main(String[] args) {
		double threshold =25.0;
		SensorData data = new SensorData(30.5, 60.0);
		Function<SensorData, Double> getTemperature1=new Function<SensorData,Double>() {
			@Override
			public Double apply(SensorData data ) {
				return data.getTemperature();
			}
		};
		Function<Double, Boolean> check =new Function<>() {

			@Override
			public Boolean apply(Double temp) {
				
				return temp>threshold;
			}
			
		};
		 Double temperature = getTemperature1.apply(data);

	        System.out.println("Temperature = " + temperature);

	        Boolean result = check.apply(temperature);

	        System.out.println(result);
	}

}
