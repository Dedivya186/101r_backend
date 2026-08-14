package com.patterns;

public class Example2 {

	public static void main(String[] args) {
        int count=1;
        int n=4;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(j<=i) {
        			System.out.print(count+++" ");
        		}
        	}
        	System.out.println("");
        }
	}

}
