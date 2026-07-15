package com.loops;

public class Example4 {
	 public boolean isHarshadNumber(int num){
	        int sum=0;
	        int original=num;
	        while(num>0){
	            int digit=num%10;
	            sum+=digit;
	            num/=10;
	        }
	        return original%sum==0;
	    }
	    public static void main(String [] args){
	       Example4 obj=new Example4();
	        System.out.println(obj.isHarshadNumber(18)?"HarshadNumber":"Not HarshadNumber");
	    }
}
