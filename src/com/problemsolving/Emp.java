package com.problemsolving;

class Employee {
    private int employeeId;
    private String employeeName;
    protected double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayDetails() {
        System.out.println("Employee : " + employeeName);
        System.out.println("Basic Salary : " + basicSalary);
    }
}

class Developer extends Employee {

    Developer(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }

    @Override
    public void displayDetails() {
        double allowance = basicSalary * 0.20;

        System.out.println("Employee : Developer");
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Allowance : " + allowance);
        System.out.println("Final Salary : " + calculateSalary());
    }
}

class Tester extends Employee {

    Tester(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + (basicSalary * 0.15);
    }

    @Override
    public void displayDetails() {
        double allowance = basicSalary * 0.15;

        System.out.println("Employee : Tester");
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Allowance : " + allowance);
        System.out.println("Final Salary : " + calculateSalary());
    }
}

class Manager extends Employee {

    Manager(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + (basicSalary * 0.30);
    }

    @Override
    public void displayDetails() {
        double allowance = basicSalary * 0.30;

        System.out.println("Employee : Manager");
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Allowance : " + allowance);
        System.out.println("Final Salary : " + calculateSalary());
    }
}

public class Emp {
    public static void main(String[] args) {

        Employee emp;

        emp = new Developer(101, "Rahul", 50000);
        emp.displayDetails();

        System.out.println();

        emp = new Tester(102, "Anil", 50000);
        emp.displayDetails();

        System.out.println();

        emp = new Manager(103, "Priya", 50000);
        emp.displayDetails();
    }
}