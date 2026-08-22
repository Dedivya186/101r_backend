package com.day10;

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void displayEmployee() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        System.out.print("Name: ");
        m.name = sc.nextLine();

        System.out.print("Salary: ");
        m.salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Department: ");
        m.department = sc.nextLine();

        m.displayManager();
    }
}