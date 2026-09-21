package com.predifinefuncInterface;

import java.util.function.Consumer;

public class Example2 {

	public static void main(String[] args) {
		Consumer<Character> cc=new Consumer<Character>() {

			@Override
			public void accept(Character t) {
				int num=(int)t;
				int count=0;
				for(int i=1;i<=num;i++) {
					if(num%i==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.println("prime");
				}
				else {
					System.out.println(" not a prime");
				}
				
				
			}
			
		};
		cc.accept('a');

	}

}
