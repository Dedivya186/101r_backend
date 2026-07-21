package com.patterns;

public class File1 {

	public static void main(String[] args) {
	   int n=5;
//	   for(int i=1;i<=n;i++) {
//		   for(int j=1;j<=n;j++) {
//			   if(i==j) {
//			   System.out.print(i);
//		       }
//			   else {
//				   System.out.print(1) ;
//			   }
//		   }
//		   System.out.println();
//	   }
	   
//	   for(int i=1;i<=n;i++) {
//		   for(int j=1;j<=n;j++) {
//			   if(j<=i) {
//			   System.out.print(j);
//		       }
//			   else {
//				   System.out.print(1) ;
//			   }
//		   }
//		   System.out.println();
//	   }
//	   for(int i=1;i<=n;i++) {
//		   for(int j=1;j<=n;j++) {
//			   if(j<=i) {
//			   System.out.print(i);
//		       }
//			   else {
//				   System.out.print(1) ;
//			   }
//		   }
//		   System.out.println();
//	   }
//	   for(int i=1;i<=n;i++) {
//		   for(int j=1;j<=n;j++) {
//			   
//			   if ((i + j) % 2 == 0) {
//                   System.out.print(1);
//               } else {
//                   System.out.print(0);
//               }
//		    
//		   }
//		   System.out.println();
//	   }
//	   for(int i=1;i<=n;i++) {
//		   for(int j=1;j<=n;j++) {
//			   
//			   if (i<=j) {
//                   System.out.print(1);
//               } else {
//                   System.out.print(0);
//               }
//		    
//		   }
//		   System.out.println();
//	   }
//	   for(int i=1;i<=n;i++) {
//		   for(int j=1;j<=n;j++) {
//			   
//			   if (i==j) {
//                   System.out.print(i);
//               } else {
//                   System.out.print(0);
//               }
//		    
//		   }
//		   System.out.println();
//	   }
//	   for(int i=1;i<=n;i++) {
//		   for(int j=1;j<=n-i;j++) {
//			   System.out.print(" ");
//		   }
//		   for(int k=1;k<=i;k++) {
//			  System.out.print(k);
//		    
//		   }
//		   System.out.println();
//	   }
	  
		        
		        for (int i = n; i >= 1; i--) {
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print(" ");
		            }
		            for (int k = i; k <= n; k++) {
		                System.out.print(k);
		            }
		            System.out.println();
		        }
		    }
		
	

}
