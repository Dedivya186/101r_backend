package com.overloading;

class Employee {

    // Basic salary only
    double calculateSalary(int basicSalary) {
        return basicSalary;
    }

    // Basic salary + bonus
    double calculateSalary(int basicSalary, int bonus) {
        return basicSalary + bonus;
    }

    // Basic salary + bonus + allowance
    double calculateSalary(double basicSalary, double bonus, double allowance) {
        return basicSalary + bonus + allowance;
    }
}


public class Salary {

    public static void main(String[] args) {

        Employee emp = new Employee();

        double salary1 = emp.calculateSalary(25000);
        System.out.println("Salary 1: ₹" + salary1);

        double salary2 = emp.calculateSalary(25000, 5000);
        System.out.println("Salary 2: ₹" + salary2);

        double salary3 = emp.calculateSalary(25000.0, 5000.0, 3000.0);
        System.out.println("Salary 3: ₹" + salary3);
    }
}
