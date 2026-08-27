package com.oops;

abstract class Employee{
	private String  employeeId;
	private String name;
	
	Employee( String  employeeId,String name){
		this.employeeId=employeeId;
		this.name=name;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	abstract double calculateSalary();
	 abstract void displayDetails();
	 public  void printBasicInfo() {
		 System.out.println("Employee id:"+this.employeeId);
		 System.out.println("Name:"+this.name);
	 }
}
class FacultyMember extends Employee{
	private int departmentCode;
	private int yearsOfService;
	FacultyMember(int departmentCode, int yearsOfService,String  employeeId,String name){
		super(employeeId,name);
		this.departmentCode=departmentCode;
		this.yearsOfService=yearsOfService;
		
	}
	public int getDepartmentCode() {
		return departmentCode;
	}
	public int getYearsOfService() {
		return yearsOfService;
	}
	@Override
	double calculateSalary() {
		double salary=50000;
		salary+=1000*yearsOfService;
		return salary;
	}
	@Override
	void displayDetails() {
		 System.out.println("Employee Details:");

	        printBasicInfo();
       System.out.println("departmentCode"+this.departmentCode);
		 System.out.println("yearsOfService:"+this.yearsOfService);
		
	}
	
}
class StaffMember extends Employee {

    private String designation;
    private double overtimeHours;

    StaffMember(String designation, double overtimeHours,
                String employeeId, String name) {

        super(employeeId, name);

        this.designation = designation;
        this.overtimeHours = overtimeHours;
    }

    public String getDesignation() {
        return designation;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

   
    @Override
    double calculateSalary() {

        double salary = 40000;

        salary += 25 * overtimeHours;

        return salary;
    }

    @Override
    void displayDetails() {

        System.out.println("Employee Details:");

        printBasicInfo();

        System.out.println("Designation: " + designation);
        System.out.println("Overtime Hours: " + overtimeHours);

        
    }
}

public class UniversityManagementSystem {

	public static void main(String[] args) {
		 Employee[] employee = {
		            new FacultyMember(101, 5, "F001", "John Smith"),
		            new StaffMember("Administrator", 20, "S001", "Jane Doe")
		        };

		        for (Employee employees : employee) {

		            employees.displayDetails();
                    System.out.println("Monthly Salary:$"+employees.calculateSalary());
                    System.out.println();
	}
		        }

}
