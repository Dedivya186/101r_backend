package com.matrix;

public class Example6 {

	public static void main(String[] args) {
		int a[][]= {{2,5,6},{3,4,1},{9,11,3}};
        int key=9;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
              if(a[i][j]==key) {
            	  System.out.println("indexes : i:"+i +""
            	  		+ " j:"+j);
              }
			}
		}
		
	}

}
