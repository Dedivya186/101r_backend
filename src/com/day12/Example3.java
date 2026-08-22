package com.day12;

class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

public class Example3 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.work();
    }
}