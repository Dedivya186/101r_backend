package com.day10;

import java.util.Scanner;

class Persons {
    String name;
    int age;
}

class Teacher extends Persons {
    String subject;
    int experience;

    void displayTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " Years");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Teacher t = new Teacher();

        System.out.print("Name: ");
        t.name = sc.nextLine();

        System.out.print("Age: ");
        t.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Subject: ");
        t.subject = sc.nextLine();

        System.out.print("Experience: ");
        t.experience = sc.nextInt();

        t.displayTeacher();
    }
}