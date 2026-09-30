package com.multithreading;
class MyRunnable implements Runnable{

	@Override
	public void run() {
         for(int i=0;i<3;i++) {		
        	 System.out.println("Runnable thread is running");
         }
	}
	
}
public class Example2 {

	public static void main(String[] args) {
       MyRunnable rn=new MyRunnable();
       Thread th=new Thread(rn);
       th.start();
	}

}
