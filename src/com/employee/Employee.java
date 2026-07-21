package com.employee;

public class Employee {
	public int employeeId;
    public String employeeName;
    public double salary;
    
    public void setDetails(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    
    public void displayEmployee() {
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary        : " + salary);
    }
}
