package com.matrix;

public class Example5 {

	public static void main(String[] args) {
		int a[][]= {{2,5,9},{3,4,1},{9,11,3}};
		for(int i=0;i<a.length;i++) {
			int left=0;
			int right=a[i].length-1;
			while(left<right) {
				int temp=a[i][left];
				a[i][left]=a[i][right];
				a[i][right]=temp;
				left++;
				right--;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}

}
