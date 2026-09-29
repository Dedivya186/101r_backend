package com.exception;

import java.util.Scanner;

class InvalidMarks extends Exception {

    public InvalidMarks(String msg) {
        super(msg);
    }
}

public class Student {

    public static void validateMarks(int marks) throws InvalidMarks {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarks("Marks must be between 0 and 100");
        }

        System.out.println("Valid marks: " + marks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 5; i++) {

                System.out.print("Enter marks for subject " + i + ": ");
                int marks = sc.nextInt();

                validateMarks(marks);
            }
        }
        catch (InvalidMarks e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    }