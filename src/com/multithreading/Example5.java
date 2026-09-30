package com.multithreading;
class ShowThreadName extends Thread{
	public void run() {
		System.out.println("Thread name: "+Thread.currentThread().getName());
	}
}
public class Example5 {

	public static void main(String[] args) {
       ShowThreadName stn=new ShowThreadName();
       stn.setName("MyCustomThread");
       stn.start();
	}

}
