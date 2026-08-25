package com.day15;

class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new int[5];

        for (int i = 0; i < 5; i++) {
            if (marks[i] >= 0 && marks[i] <= 100) {
                this.marks[i] = marks[i];
            } else {
                this.marks[i] = 0;
                System.out.println("Invalid mark for subject " + (i + 1));
            }
        }
    }

    public int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    public char calculateGrade() {
        double average = calculateAverage();

        if (average >= 80)
            return 'A';
        else if (average >= 60)
            return 'B';
        else if (average >= 50)
            return 'C';
        else if (average >= 40)
            return 'D';
        else
            return 'F';
    }

    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("----------------------");
    }
}

public class SstudentResult {
    public static void main(String[] args) {

        Student s1 = new Student(
            "Suman",
            101,
            new int[]{80, 75, 90, 85, 70}
        );

        Student s2 = new Student(
            "Ravi",
            102,
            new int[]{65, 70, 60, 75, 80}
        );

        Student s3 = new Student(
            "Priya",
            103,
            new int[]{45, 50, 55, 60, 40}
        );

        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
    }
}