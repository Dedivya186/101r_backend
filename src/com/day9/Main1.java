package com.day9;

import java.util.Scanner;

class Employees {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary = salary + (salary * percentage / 100);
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employees e = new Employees();

        System.out.print("Salary: ");
        e.setSalary(sc.nextDouble());

        System.out.print("Increase: ");
        double percentage = sc.nextDouble();

        e.increaseSalary(percentage);

        System.out.println("Final Salary: " + e.getSalary());
    }
}