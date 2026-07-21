package com.patterns;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int n=5;
//             for(int i=1;i<=n;i++) {
//            	 for(int j=1;j<=n;j++) {
//            		 if(i==j) {
//            			 System.out.print(i);
//            		 }
//            		 else {
//            		 System.out.print(1);
//            	 }
//            		 }
//            	 System.out.println();
//             }
//             for(int i=1;i<=n;i++) {
//            	 for(int j=1;j<=n;j++) {
//            		 if(j<=i) {
//            		System.out.print(j);
//            	 }
//            		 else {
//            			 System.out.print(1);
//            		 }
//            	 }
//            	 System.out.println();
//             }
//             for(int i=1;i<=n;i++) {
//            	 for(int j=1;j<=n;j++) {
//            		 if(j<=i) {
//            		System.out.print(i);
//            	 }
//            		 else {
//            			 System.out.print(1);
//            		 }
//            	 }
//            	 System.out.println();
//             }
             
//             for(int i=n;i>=1;i--) {
//            	 for(int j=1;j<=n;j++) {
//            		System.out.print(i);
//            	 }
//            	 System.out.println();
//             }
//             for(int i=1;i<=n;i++) {
//            	 for(int j=n;j>=1;j--) {
//            		System.out.print(j);
//            	 }
//            	 System.out.println();
//             }
             
//             for(int i=1;i<=n;i++) {
//            	 for(int j=1;j<=n;j++) {
//            		 if(i==j) {
//            			 System.out.print(i);
//            		 }
//            		 else {
//            		 System.out.print(0);
//            	       }
//            	 }
//            		 System.out.println();
//             }
//               for(int i=1;i<=n;i++) {
//            	   for(int j=1;j<=n-i;j++) {
//            		   System.out.print(" ");
//            	   }
//            	   for(int k=1;k<=i;k++) {
//            		   System.out.print(k);
//            	   }
//            	   System.out.println();
//               }
//             for(int i=1;i<=n;i++) {
//            	 for(int j=i;j<=n;j++) {
//            		 System.out.print(j);
//            	 }
//            	 System.out.println();
//             }
//             for(int i=65;i<=69;i++) {
//            	 for(int j=i;j<=69;j++) {
//            		 System.out.print((char)(j));
//            	 }
//            	 System.out.println();
//             }
//             for (char i = 'A'; i <= 'E'; i++) {
//            	    for (char j = i; j <= 'E'; j++) {
//            	        System.out.print(j);
//            	    }
//            	    System.out.println();
//            	}
             
//             for(int i=65;i<=69;i++) {
//            	 for(int j=69;j>=i;j--) {
//            		 System.out.print((char)(j));
//            	 }
//            	 System.out.println();
//             }
//             
//             for (char i = 'A'; i <= 'E'; i++) {
//         	    for (char j = 'E'; j >= i; j--) {
//         	        System.out.print(j);
//         	    }
//         	    System.out.println();
//         	}
//             for(int i=65;i<=69;i++) {
//            	 for(int j=69;j>=i;j--) {
//            		 System.out.print((char)(j));
//            	 }
//            	 System.out.println();
//             }
//             for (int i = 1; i <= n; i++) {
//            	    for (int j = 1; j <= i; j++) {
//            	        System.out.print("* ");
//            	    }
//            	    System.out.println();
//            	}
//             for (int i = n; i >= 1; i--) {
//            	    for (int j = 1; j <= i; j++) {
//            	        System.out.print("* ");
//            	    }
//            	    System.out.println();
//            	}
             
	for (int i = 1; i <= n; i++) {
	    for (int j = 1; j <= n - i; j++) {
	        System.out.print(" ");
	    }
	    char ch = (char) ('A' + i - 1);
	    for (int j = 1; j <= 2 * i -1; j++) {
	    	 System.out.print(ch);
	    }
	    System.out.println();
	}
//	for (int i = 1; i <= n; i++) {
//	    for (int j = 1; j <= n - i; j++) {
//	        System.out.print(" ");
//	    }
//	    char ch = (char) ('A' + i - 1);
//	    for (int k=1;k<=i;k++) {
//	        System.out.print(ch);
//	    }
//	    System.out.println();
//	}
}   
}
