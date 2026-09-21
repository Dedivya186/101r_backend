package com.matrix;

public class Example4 {

	public static void main(String[] args) {
		int a[][]= {{2,5,9},{3,4,1},{9,11,3}};
		int rows=a.length;
		int col=a[0].length;
		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<col;j++) {
//              if(i>j) {
//            	  a[i][j]=0;
//              }
//			}
//		}
//		for(int i=0;i<col;i++) {
//			for(int j=0;j<rows;j++) {
//				System.out.print(a[i][j]);
//			}
//			System.out.println("");
//		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
              if(i<j) {
            	  a[i][j]=0;
              }
			}
		}
		for(int i=0;i<col;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}

}
