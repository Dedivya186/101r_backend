package com.day9;

import java.util.Scanner;

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }
}

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p = new Person();

        System.out.print("Age: ");
        p.setAge(sc.nextInt());

        if (p.getAge() != 0) {
            System.out.println("Age: " + p.getAge());
        }
    }
}