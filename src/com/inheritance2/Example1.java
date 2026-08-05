package com.inheritance2;



import java.util.Scanner;

class Vehicle {
	String ownerName;
	String vehicleNumber;
	String vehicleType;

	public Vehicle(String ownerName, String vehicleNumber, String vehicleType) {

		this.ownerName = ownerName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}

	public void displayParentData() {
		System.out.println("Vehicle Owenwer Name : " + ownerName);
		System.out.println("Vehicle Vehicle Number : " + vehicleNumber);
		System.out.println("Vehicle Vehicle Type  : " + vehicleType);
	}

}

class ServiceVehicle extends Vehicle {

	String serviceCenterName;
	String serviceCategory;

	public ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType, String serviceCenterName,
			String serviceCategory) {
		super(ownerName, vehicleNumber, vehicleType);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = serviceCategory;
		System.out.println("vehicle profile has been created.");
	}

	public void updatedServiceCategory(String category) {
		if (category == null && category.equals("")) {
			System.out.println("invalid category details.....");
		} else {
			this.serviceCategory = category;
			System.out.println("servce category upadted successfully");
		}

	}

	public void updatedServiceCenterName(String centerName) {
		if (centerName == null && centerName.equals("")) {
			System.out.println("invalid category details.....");
		} else {
			this.serviceCenterName = centerName;
			System.out.println("Service Center name Updated Successfully..");
		}
	}

	public void profileDetails() {
		displayParentData();
		System.out.println("Servce Center Name : " + serviceCenterName);
		System.out.println("Service Category Name : " + serviceCategory);
	}

}

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Owener Name : ");
		String name = sc.nextLine();

		System.out.println("Enter vehicle Number : ");
		String num = sc.nextLine();

		System.out.println("Enter vehicle type : ");
		String type = sc.nextLine();

		System.out.println("Service Center Name : ");
		String centerName = sc.nextLine();

		System.out.println("Enter service Category : ");
		String category = sc.nextLine();

		ServiceVehicle sv = new ServiceVehicle(name, num, type, centerName, category);

		int choice = 0;
		boolean status = true;

		while (status) {

			System.out.println("Provide a menu to perform the following operations:\r\n" + "1.Update Service Category\r\n"
					+ "2. Update Service Center Name\r\n" + "3. View Vehicle Profile Details\r\n" + "4. Exit the program\r\n"
					+ "");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("ENter updated Service category : ");
				String categorys = sc.nextLine();
				sv.updatedServiceCategory(categorys);
				break;
			case 2:
				System.out.println("ENter updated Service Center Name : ");
				String cName = sc.nextLine();
				sv.updatedServiceCenterName(cName);
				break;
			case 3:
				sv.profileDetails();
				break;
			case 4:
				System.out.println("Thank You !");
				status=false;
				break;

			default:System.out.println("Invalid Options selected....");
				break;
			}

		}

		sc.close();

	}

}