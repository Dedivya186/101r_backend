package com.exceptionhandling;

public class Vehicle {
	public void checkAge(int ageOfVehicle , int ageOfTire , int ageOfEngine)throws Exception {
		 if (ageOfVehicle > 10) {
	            throw new InvalidAgeOfVehicleException(
	                    "Greater than 10 years vehicles are not allowed.");
	        }

	        if (ageOfTire > 2) {
	            throw new InvalidAgeOfTireException(
	                    "Greater than 2 years tires are not allowed.");
	        }

	        if (ageOfEngine > 15) {
	            throw new InvalidAgeOfEngineException(
	                    "Greater than 15 years engines are not allowed.");
	        }
	}

	public static void main(String[] args) {
		 Vehicle v = new Vehicle();

	       
	    	   try {
				v.checkAge(5,1,10);
			   } 
	       
	        catch (InvalidAgeOfVehicleException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (InvalidAgeOfTireException e) {
	            System.out.println(e.getMessage());
	        }
	        catch (InvalidAgeOfEngineException e) {
	            System.out.println(e.getMessage());
	        } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
