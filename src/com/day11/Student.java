package com.day11;

class Student {

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void display(String name, int age, int marks) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.display("Sumanjali");
        System.out.println();

        s.display("Sumanjali", 20);
        System.out.println();

        s.display("Sumanjali", 20, 85);
    }
}