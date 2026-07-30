package com.encapsulation;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee employee = new Employee();

        employee.setEmployeeId(1001);
        employee.setEmployeeName("Ravi");
        employee.setDepartment("Development");
        employee.setSalary(45000.0);

        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Employee ID   : " + employee.getEmployeeId());
        System.out.println("Employee Name : " + employee.getEmployeeName());
        System.out.println("Department    : " + employee.getDepartment());
        System.out.println("Salary        : " + employee.getSalary());
	}

}
