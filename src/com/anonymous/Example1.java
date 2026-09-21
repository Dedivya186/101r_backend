package com.anonymous;

interface NumberChecker{
	public boolean checkNumber(int i);
}
public class Example1 {

	public static void main(String[] args) {
		NumberChecker nc= new NumberChecker() {

			@Override
			public boolean checkNumber(int n) {
				int count=0;
				for(int i=1;i<=n;i++) {
					if(n%i==0) {
						count++;
					}
				}
				return count==2?true:false;
			}
			
		};
		System.out.println(nc.checkNumber(2));
		 System.out.println(nc.checkNumber(5));
	        System.out.println(nc.checkNumber(10));
	}

}
