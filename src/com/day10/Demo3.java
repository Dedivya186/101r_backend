package com.day10;

import java.util.Scanner;

class Employees {
    String name;
    double salary;
}

class Developer extends Employees {
    double bonus;

    void calculateSalary() {
        double finalSalary = salary + bonus;

        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + finalSalary);
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Developer d = new Developer();

        System.out.print("Name: ");
        d.name = sc.nextLine();

        System.out.print("Salary: ");
        d.salary = sc.nextDouble();

        System.out.print("Bonus: ");
        d.bonus = sc.nextDouble();

        d.calculateSalary();
    }
}