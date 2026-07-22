package test;

public class Employee {
	int employeeId;
    String employeeName;
    double salary;
    
    public void setEmployeeDetails(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Employee Details");
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + salary);
    }
	public static void main(String[] args) {
		Employee emp = new Employee();
        emp.setEmployeeDetails(1001, "Ravi", 45000);
        emp.displayDetails();
	}

}
