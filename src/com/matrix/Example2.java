package com.matrix;

public class Example2 {

	public static void main(String[] args) {
		int a[][]= {{2,5,9},{3,4,1}};
		int rows=a.length;
		int col=a[0].length;
		int [][] a2=new int[col][rows];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				a2[j][i]=a[i][j];
			}
		}
		for(int i=0;i<col;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(a2[i][j]);
			}
			System.out.println("");
		}

	}

}
