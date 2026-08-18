package com.day9;

import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Stud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Name: ");
        s.setName(sc.nextLine());

        System.out.print("Roll No: ");
        s.setRollNo(sc.nextInt());

        System.out.print("Marks: ");
        s.setMarks(sc.nextInt());

        s.display();
    }
}