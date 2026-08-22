package com.day13;

abstract class Employee {
    abstract void calculateSalary();
}

class Developer extends Employee {
    double salary;

    Developer(double salary) {
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Developer Salary: " + salary);
    }
}

class Manager extends Employee {
    double salary;

    Manager(double salary) {
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Manager Salary: " + salary);
    }
}

public class EmployeManagement {
    public static void main(String[] args) {

        Employee developer = new Developer(50000);
        Employee manager = new Manager(70000);

        developer.calculateSalary();
        manager.calculateSalary();
    }
}