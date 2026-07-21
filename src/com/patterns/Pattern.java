package com.patterns;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//      for(int i=1;i<=n;i++) {
//    	  for(int j=1;j<=n;j++) {
//    		  System.out.print("* ");
//    	  }
//    	  System.out.println();
//      }
//		 for(int i=1;i<=n;i++) {
//	    	  for(int j=1;j<=i;j++) {
//	    		  System.out.print("* ");
//	    	  }
//	    	  System.out.println();
//	      }
//		 for(int i=1;i<=n;i++) {
//	    	  for(int j=1;j<=n;j++) {
//	    		  System.out.print("* ");
//	    	  }
//	    	  System.out.println();
//	      }
//		 for(int i=n;i>=1;i--) {
//	    	  for(int j=1;j<=i;j++) {
//	    		  System.out.print("* ");
//	    	  }
//	    	  System.out.println();
//	      }
//		 for(int i=1;i<=n;i++) {
//	    	  for(int j=1;j<=n;j++) {
//	    		  if(i==1||j==1||i==n||j==n ) {
//	    		  System.out.print("*");
//	    	  }
//	    		  else {
//	    			  System.out.print(" ");
//	    		  }
//	    	  }
//	    	  System.out.println();
//	      }
		 for(int i=1;i<=n;i++) {
	    	  for(int j=1;j<=n;j++) {
	    		  System.out.print(i+" ");
	    	  }
	    	  System.out.println();
	      }
//		for(int i=1;i<=n;i++) {
//	    	  for(int j=1;j<=n;j++) {
//	    		  System.out.print(j+" ");
//	    	  }
//	    	  System.out.println();
//	      }
//		int count=1;
//		for(int i=1;i<=n;i++) {
//	    	  for(int j=1;j<=n;j++) {
//	    		  
//	    		  System.out.print( count<10 ? "0"+count+++" ": count++ +" ");
//	    	  }
//	    	  System.out.println();
//	      }
//		for(int i=1;i<=n;i++) {
//	    	  for(int j=1;j<=n;j++) {
//	    		  System.out.print(i+j-1+" ");
//	    	  }
//	    	  System.out.println();
//	      }
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
			   System.out.print(" ");
			}
	    	  for(int j=1;j<=i;j++) {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
		
	}

}
