package com.demo;

public class AccessDemo {
	public void publicMethod() {
        System.out.println("Public Method");
    }
    
    private void privateMethod() {
        System.out.println("Private Method");
    }
    
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
    
    void defaultMethod() { 
        System.out.println("Default Method");
    }
}

