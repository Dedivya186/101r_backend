package com.demo;

public class TestAccess {
	public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        
        // obj.privateMethod(); 
        
        System.out.println();
        System.out.println("Observation: ");
        System.out.println("The private method cannot be accessed outside its own class.");
    }
}
