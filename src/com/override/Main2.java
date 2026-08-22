package com.override;

class Person {
    protected void display() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    @Override
    public void display() {
        System.out.println("I am a student");
    }
}

public class Main2 {
    public static void main(String[] args) {

        Student s = new Student();
        s.display();
    }
}