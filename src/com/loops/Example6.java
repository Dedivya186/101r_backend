package com.loops;

public class Example6 {
    public boolean isSunny(int num) {
    	int nextNumber=num+1;
    	int i=1;
    	while(i*i<=nextNumber) {
    		if(i*i==nextNumber) {
    			return true;
    		}
    		i++;
    	}
    	return false;
    }
    public static void main(String []args) {
    	Example6 obj=new Example6();
    	if(obj.isSunny(9)) {
    		System.out.println("Sunny Number");
    	}
    	else {
    		System.out.println("Not Sunny Number");
    	}
    }
}
