package com.anonymous;
interface NumberChecker{
	public boolean checkNumber(int i);
}
interface CharChecker{
	public void checkChar(char c);
}
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
		
		NumberChecker nc= new NumberChecker() {
			public boolean checkNumber(int n) {
				return isPrime(n);
			}
			
		};
		CharChecker check=new CharChecker() {

			@Override
			public void checkChar(char c) {
				int num=(int)c;
				if(isPrime(num)) {
					System.out.println("prime");
				}
				else {
					System.out.println(" not a prime");
				}
			}
			
		};
		check.checkChar('A');
        System.out.println("**************");
        System.out.println(nc.checkNumber(5));
	}

}
