package com.pack;

public class Main {
	   //digit count
      public static int count_digits(int n) {
    	  int count=0;
    	  while(n>0) {
    		  n/=10;
    		  count++;
    	  }
    	 return count;
      }
      //fibonacci
      public void fibonacci(int n) {
    	  int f1=0;
    	  int f2=1;
    	  while(n>0) {
    		  System.out.print(f1);
    		  int a=f1+f2;
    		  f1=f2;
    		  f2=a;
    		 
    		  n--;
    	  }
      }
      //prime numbers 
      public void prime_numbers(int start, int end) {
    	  for (int i = start; i <= end; i++) {
              if (i < 2) {
                  continue;
              }

              boolean isPrime = true;
              for (int j = 2; j <= i / 2; j++) {
                  if (i % j == 0) {
                      isPrime = false;
                      break;
                  }
              }

              if (isPrime) {
                  System.out.print(i + " ");
              }
          }
          System.out.println();
    	  
      }
      //factors of a number
      public static void factors(int n) {
          for (int i = 1; i <= n; i++) {
              if (n % i == 0) {
                  System.out.print(i + " ");
              }
          }
          System.out.println();
      }
      //GCD
      public static int gcd(int a, int b) {
          while (b != 0) {
              int temp = b;
              b = a % b;
              a = temp;
          }
          return a;
      }

      //  (LCM)
      public static int lcm(int a, int b) {
          return (a * b) / gcd(a, b);
      }
      public static void main(String[] args) {
       Main obj=new Main();
          System.out.println("Digit Count: "+obj.count_digits(1234));

          System.out.print("Fibonacci Series: ");
          obj.fibonacci(10);
           System.out.println();
          System.out.print("Prime Numbers (10 to 50): ");
          obj.prime_numbers(10, 50);

          System.out.print("Factors of 24: ");
          factors(24);

          System.out.println("GCD of 24 and 36: " + gcd(24, 36));
          System.out.println("LCM of 24 and 36: " + lcm(24, 36));
}
}
