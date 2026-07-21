package com.patterns;

public class File2 {

	public static void main(String[] args) {
		int n=5;
		for(int i=65;i<=69;i++) {
       	 for(int j=i;j<=69;j++) {
       		 System.out.print((char)(j));
       	 }
       	 System.out.println();
        }
	
//	 for(int i=65;i<=69;i++) {
//    	 for(int j=69;j>=i;j--) {
//    		 System.out.print((char)(j));
//    	 }
//    	 System.out.println();
//     }
//		for (int i = 1; i <= n; i++) {
//		    for (int j = 1; j <= n - i; j++) {
//		        System.out.print(" ");
//		    }
//		    char ch = (char) ('A' + i - 1);
//		    for (int k=1;k<=i;k++) {
//		        System.out.print(ch);
//		    }
//		    System.out.println();
//		}
//		for (int i = 1; i <= n; i++) {
//		    for (int j = 1; j <= n - i; j++) {
//		        System.out.print(" ");
//		    }
//		    char start = (char) ('A' + n - i);
//            for (char k = start; k <= 'E'; k++) {
//                System.out.print(k);
//            }
//		    System.out.println();
//		}
		for (int i = 1; i <= n; i++) {
			
			char start = (char) 'A';
		    for (int j = 1; j <= n; j++) {
		        System.out.print(start++);
		    }
		   
		    System.out.println();
		}
		
}
}