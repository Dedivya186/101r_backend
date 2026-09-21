package com.matrix;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
//		int [][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i=0;i<matrix.length;i++) {
//			for(int j=0;j<matrix[i].length;j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println("");
//		}
//		Scanner sc =new Scanner(System.in);
//		int r=sc.nextInt();
//		int c=sc.nextInt();
//		int arr[][]=new int[r][c];
//		int sum=0;
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				 arr[i][j]=sc.nextInt();
//			}
//			
//		}
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				 System.out.print(arr[i][j]+" ");
//			}
//			 System.out.println("");
//		}
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				sum+=arr[i][j];
//			}
//			
//		}
//		System.out.println(sum);
		int [][] arr1= {{2,4},{5,6}};
		int [][] arr2= {{1,3},{7,8}};
		int result[][]=new int[arr1.length][arr1.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				result[i][j]= arr1[i][j]+arr2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println(""); 
			
		}
	}

}
