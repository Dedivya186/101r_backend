package com.day10;

import java.util.Scanner;

class Personss {
    String name;
}

class Employeess extends Personss {
    double salary;
}

class Managers extends Employeess {
    String department;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Managers m = new Managers();

        System.out.print("Name: ");
        m.name = sc.nextLine();

        System.out.print("Salary: ");
        m.salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Department: ");
        m.department = sc.nextLine();

        m.displayDetails();

        sc.close();
    }
}