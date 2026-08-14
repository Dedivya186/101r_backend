package com.patterns;

public class Example3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
			   System.out.print(" ");
			}
	    	  for(int j=1;j<=i;j++) {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
		System.out.println("---------------------");
		for(int i=n;i>0;i--) {
			for(int k=1;k<=n-i;k++) {
			   System.out.print(" ");
			}
	    	  for(int j=1;j<=i;j++) {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
		System.out.println("---------------------");

		for(int i=n;i>0;i--) {
			for(int k=1;k<=i;k++) {
			   System.out.print("*");
			} 
	    	  System.out.println();
	      }
		
		System.out.println("---------------------");
		for(int i=1;i<=n;i++) {
			for(int k=n-1;k>1;k--) {
			   System.out.print(" ");
			}
	    	  for(int j=1;j<=i;j++) {
	    		  System.out.print(i+"");
	    	  }
	    	  System.out.println();
	      }

	}

}
