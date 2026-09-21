package com.matrix;

public class Example3 {

	public static void main(String[] args) {
		int a[][]= {{2,5,9},{3,4,1}};
		int rows=a.length;
		int col=a[0].length;
		int max=a[0][0];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
