package com.abstraction;

abstract class Employee {

    String name;
    String id;

    Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void applyLeave() {
        System.out.println("Leave applied successfully.");
    }

    void getDetails() {
        System.out.println("Employee Details: " + name + ", ID: " + id);
    }
}

class FullTimeEmployee extends Employee {

    double basePay;
    double benefits;

    FullTimeEmployee(String name, String id, double basePay, double benefits) {
        super(name, id);
        this.basePay = basePay;
        this.benefits = benefits;
    }

    void calculateSalary() {
        double salary = basePay + benefits;

        System.out.println(
            "Calculating salary: Base pay + benefits = $" + salary
        );
    }
}

class PartTimeEmployee extends Employee {

    double hourlyRate;
    double hoursWorked;

    PartTimeEmployee(String name, String id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;

        System.out.println(
            "Calculating salary: Hours worked × rate = $" + salary
        );
    }
}

class Freelancer extends Employee {

    double projectPayment;

    Freelancer(String name, String id, double projectPayment) {
        super(name, id);
        this.projectPayment = projectPayment;
    }

    void calculateSalary() {
        System.out.println(
            "Calculating salary: Project payment = $" + projectPayment
        );
    }
}

public class Roll {

    public static void main(String[] args) {

        Employee employee;

        employee = new FullTimeEmployee(
            "John Doe",
            "12345",
            50000,
            10000
        );

        employee.calculateSalary();
        employee.applyLeave();
        employee.getDetails();

        System.out.println();

        employee = new PartTimeEmployee(
            "Jane Smith",
            "67890",
            20,
            15
        );

        employee.calculateSalary();
        employee.applyLeave();
        employee.getDetails();

        System.out.println();

        employee = new Freelancer(
            "Alice Johnson",
            "54321",
            5000
        );

        employee.calculateSalary();
        employee.applyLeave();
        employee.getDetails();
    }
}