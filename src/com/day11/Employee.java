package com.day11;

class Employee {

    double calculateSalary(double basicSalary) {
        return basicSalary;
    }

    double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }

    double calculateSalary(double basicSalary, double bonus, double allowance) {
        return basicSalary + bonus + allowance;
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        System.out.println("Final Salary: " + e.calculateSalary(30000));
        System.out.println("Final Salary: " + e.calculateSalary(30000, 5000));
        System.out.println("Final Salary: " + e.calculateSalary(30000, 5000, 3000));
    }
}
