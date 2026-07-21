package com.company;
import com.employee.Employee;
public class Company {
	public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setDetails(1001, "Ravi", 45000);
        emp.displayEmployee();
}
}