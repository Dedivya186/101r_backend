package com.company.app;
import com.company.hr.Employee;
import com.company.admin.Department;
public class CompanyApp {

	public static void main(String[] args) {
		Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Ravi Kumar");
        emp.setSalary(45000.00);

        Department dept = new Department();
        dept.setDeptName("Engineering");
        dept.setDeptId(5);

        emp.showEmployeeDetails();
        System.out.println();
        dept.showDepartmentDetails();
	}

}
