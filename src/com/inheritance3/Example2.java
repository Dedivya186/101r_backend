package com.inheritance3;



class ComEmployes{
	String empname;
	String empId;
	public ComEmployes(String empname, String empId) {
		super();
		this.empname = empname;
		this.empId = empId;
	}
	
	public void displayDetails() {
		System.out.println("EMployee Name : "+ this.empname);
		System.out.println("EMployee Id : "+ this.empId);
	}
	
	
	public String toString() {
		return "EMployee Name : "+empname+"Employee Id : "+ empId;
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		ComEmployes emp=new ComEmployes("suchitra", "101");
		
		System.out.println(emp);

	}

}