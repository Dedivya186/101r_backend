package com.multithread;
class NumberPrinter implements Runnable{
	 private  int start;
	  private int end;
	  public NumberPrinter(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	  }
	  public int getStart() {
		  return start;
	  }
	  public void setStart(int start) {
		  this.start = start;
	  }
	  public int getEnd() {
		  return end;
	  }
	  public void setEnd(int end) {
		  this.end = end;
	  }
	  @Override
	  public void run() {
		for(int i=start;i<end;i++) {
			 if (start % 2 == 0 && i % 2 == 0) {
	                System.out.println(Thread.currentThread().getName() + " : " + i);
	            }

	            if (start % 2 != 0 && i % 2 != 0) {
	                System.out.println(Thread.currentThread().getName() + " : " + i);
	            }
		}
		
	  }
	  
	
}
public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		 NumberPrinter evenPrinter = new NumberPrinter(2, 20);
	        Thread evenThread = new Thread(evenPrinter, "EvenNumber");

	        NumberPrinter oddPrinter = new NumberPrinter(1, 19);
	        Thread oddThread = new Thread(oddPrinter, "OddNumber");

	        evenThread.start();

	        evenThread.join();

	        oddThread.start();
	}

}
