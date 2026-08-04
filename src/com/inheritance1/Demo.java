package com.inheritance1;


import java.util.Scanner;

class Staff {
	String staffName;
	String staffId;
	String baseShift;

	public Staff(String staffName, String staffId, String baseShift) {
		this.staffName = staffName;
		this.staffId = staffId;
		this.baseShift = baseShift;
	}

	public void displayParentData() {
		System.out.println("Staff Name : " + staffName);
		System.out.println("Staff ID : " + staffId);
		System.out.println("Base Shift : " + baseShift);
	}
}

class DepartmentStaff extends Staff {
	String departmentName;
	String responsibilityLevel;

	public DepartmentStaff(String staffName, String staffId, String baseShift, String departmentName,
			String responsibilityLevel) {
		super(staffName, staffId, baseShift);
		this.departmentName = departmentName;
		this.responsibilityLevel = responsibilityLevel;
		System.out.println("Staff profile has been created.");
	}

	public void updatedResponsibilityLevel(String responsibility) {
		if (responsibility == null || responsibility.equals("")) {
			System.out.println("invalid responsibility details.....");
		} else {
			this.responsibilityLevel = responsibility;
			System.out.println("Responsibility Level updated successfully");
		}
	}

	public void updatedDepartmentName(String department) {
		if (department == null || department.equals("")) {
			System.out.println("invalid department details.....");
		} else {
			this.departmentName = department;
			System.out.println("Department Name Updated Successfully..");
		}
	}

	public void profileDetails() {
		displayParentData();
		System.out.println("Department Name : " + departmentName);
		System.out.println("Responsibility Level : " + responsibilityLevel);
	}
}

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Staff Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Staff ID : ");
		String id = sc.nextLine();
		System.out.println("Enter Base Shift : ");
		String shift = sc.nextLine();
		System.out.println("Enter Department Name : ");
		String dept = sc.nextLine();
		System.out.println("Enter Responsibility Level : ");
		String category = sc.nextLine();

		DepartmentStaff ds = new DepartmentStaff(name, id, shift, dept, category);

		int choice = 0;
		boolean status = true;
		while (status) {
			System.out.println("Provide a menu to perform the following operations:\r\n" + "1. Update Responsibility Level\r\n"
					+ "2. Update Department Name\r\n" + "3. View Staff Profile Details\r\n" + "4. Exit the program\r\n"
					+ "");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter updated Responsibility Level : ");
				String responsibilitys = sc.nextLine();
				ds.updatedResponsibilityLevel(responsibilitys);
				break;
			case 2:
				System.out.println("Enter updated Department Name : ");
				String deptName = sc.nextLine();
				ds.updatedDepartmentName(deptName);
				break;
			case 3:
				ds.profileDetails();
				break;
			case 4:
				System.out.println("Thank You !");
				status = false;
				break;
			default:
				System.out.println("Invalid Options selected....");
				break;
			}
		}
		sc.close();
	}
}