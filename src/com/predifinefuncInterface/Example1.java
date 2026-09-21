package com.predifinefuncInterface;

import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
		Predicate<Integer> isPrime=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				int count=0;
				for(int i=1;i<=t;i++) {
					if(t%i==0) {
						count++;
					}
				}
				return count==2?true:false;
			
			}	
			
		};
		System.out.println(isPrime.test(10));
		System.out.println(isPrime.test(5));

	}

}
