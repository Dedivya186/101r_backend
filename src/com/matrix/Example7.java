package com.matrix;

public class Example7 {

	public static void main(String[] args) {
    int a[][]= {{9,2,6},{2,0,3},{6,3,5}};
    boolean sym=true;
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[i].length;j++) {
    		if(a[i][j]!=a[j][i]) {
    			sym=false;
    			break;
    		}
    	}
    	
    }
    if(sym) {
		System.out.println("symentric matrix");
	}
	else {
		System.out.println("not symentric matrix");
	}
	}

}
