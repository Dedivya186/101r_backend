package com.predifinefuncInterface;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Question1 {
	public static boolean isPrime(int number) {
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		return count==2?true:false;
	}
	public static void main(String[] args) {
		Predicate<Integer> isPrime1=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return isPrime(t);
			}
			
		};
		Consumer<Character> cc=new Consumer<Character>() {

			@Override
			public void accept(Character t) {
				int num=(int)t;
				if(isPrime(num)) {
					System.out.println("prime");
				}
				else {
					System.out.println(" not a prime");
				}
				
				
			}
		};
		
        System.out.println(isPrime1.test(2));
        System.out.println("***********");
        cc.accept('A') ; 
	}

}
