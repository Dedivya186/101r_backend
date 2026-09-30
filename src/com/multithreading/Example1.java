package com.multithreading;
class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello from MyThread"+i);
		}
	}
}
public class Example1 {

	public static void main(String[] args) {
        MyThread a=new MyThread();
        a.start();
	}

}
