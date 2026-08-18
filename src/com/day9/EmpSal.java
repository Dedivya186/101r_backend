package com.day9;

import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }
}

public class EmpSal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Name: ");
        e.setName(sc.nextLine());

        System.out.print("Salary: ");
        e.setSalary(sc.nextDouble());

        System.out.println("Employee: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}
