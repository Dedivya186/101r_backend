package com.override;

class Parent {
    static void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
	
    static void print() {
        System.out.println("Child");
    }
}

public class Main3 {
    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        p.print();
        c.print();
    }
}