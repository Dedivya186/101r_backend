package com.multithread;
public class Task3 {

	public static void main(String[] args) throws InterruptedException {
	Thread helloThread=new Thread(){
		 public void run() {
             System.out.println("Hello");
         }
	};
	 Thread worldThread = new Thread(() -> {
         System.out.println("World");
     });

     helloThread.start();

     helloThread.join();

     worldThread.start();	
			
			
			
	}

}
