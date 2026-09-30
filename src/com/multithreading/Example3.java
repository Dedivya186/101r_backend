package com.multithreading;
class FirstThread extends Thread{
	public void run() {
		System.out.println("First thread message");
	}
}
class SecondThread extends Thread{
	public void run() {
		System.out.println("Second thread message");
	}
}
public class Example3 {

	public static void main(String[] args) {
         FirstThread ft=new FirstThread();
         SecondThread st=new SecondThread();
         ft.start();
         st.start();
	}

}
