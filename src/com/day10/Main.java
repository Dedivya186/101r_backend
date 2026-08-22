package com.day10;

import java.util.Scanner;

class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    int marks;

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Name: ");
        s.name = sc.nextLine();

        System.out.print("Age: ");
        s.age = sc.nextInt();

        System.out.print("Roll No: ");
        s.rollNo = sc.nextInt();

        System.out.print("Marks: ");
        s.marks = sc.nextInt();

        s.displayStudent();
    }
}