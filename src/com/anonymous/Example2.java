package com.anonymous;

interface CharChecker{
	public void checkChar(char c);
}
public class Example2 {

	public static void main(String[] args) {
		CharChecker check=new CharChecker() {

			@Override
			public void checkChar(char c) {
				int num=(int)c;
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
		check.checkChar('A');

	}

}
