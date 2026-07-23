package com.pack;

public class Employee {
	
	int empId;
	String name;
	String designation;
	double salary;
	int performanceRating;
	Employee(int empId,	String name,String designation,double salary,int performanceRating){
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.performanceRating=performanceRating;
		
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void  promoteEmployee(int performance)	{
		if(performance>=4) {
			//System.out.println(salary+(salary*(20/100)));
			setSalary(salary);
			setDesignation(getNextDesignation(designation));
			 System.out.println("New Designation: " + designation);
		        System.out.println("Updated Salary: $" + salary);
		}
		else {
			System.out.println(salary);
		}
	}
	public void showDetails() {
	    System.out.println("Employee ID       : " + empId);
	    System.out.println("Name              : " + name);
	    System.out.println("Designation       : " + designation);
	    System.out.println("Salary            : " + salary);
	    System.out.println("Performance Rating: " + performanceRating);
	    System.out.println("-----------------------------------");
	}
	private String getNextDesignation(String current) {
        switch (current) {
            case "Trainee":
                return "Junior Developer";
            case "Junior Developer":
                return "Senior Developer";
            case "Senior Developer":
                return "Team Lead";
            case "Team Lead":
                return "Manager";
            default:
                return current; 
        }
	}
}
