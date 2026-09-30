package com.multithreading;
class NumberPrinter implements Runnable{

	@Override
	public void run() {
      for(int i=1;i<=3;i++) {
    	  System.out.println(i);
      }
	}
	
}
public class Example4 {

	public static void main(String[] args) {
      NumberPrinter np=new NumberPrinter();
      Thread th=new Thread(np);
      th.start();
	}

}
