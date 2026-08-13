package com.overloading;

class Student {

    // Two subjects
    void calculateResult(int marks1, int marks2) {

        int total = marks1 + marks2;
        double average = total / 2.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    // Three subjects
    void calculateResult(int marks1, int marks2, int marks3) {

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    // Five subjects
    void calculateResult(int marks1, int marks2, int marks3,
                         int marks4, int marks5) {

        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        double average = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}


public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("----- Two Subjects -----");
        student.calculateResult(80, 90);

        System.out.println();

        System.out.println("----- Three Subjects -----");
        student.calculateResult(80, 90, 70);

        System.out.println();

        System.out.println("----- Five Subjects -----");
        student.calculateResult(80, 90, 70, 85, 95);
    }
}