package com.multithread;
class G{
	int count;
	void increment() {
		count++;
	}
	int getCount() {
		return count;
	}
}
public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		G g=new G();
		Thread th1=new Thread(() ->{
		for(int i=1;i<=1000;i++){
			g.increment();
		System.out.println(Thread.currentThread().getName());
		}
		});
		Thread th2=new Thread(() -> {
			for(int i=1;i<1000;i++) {
			g.increment();
			System.out.println(Thread.currentThread().getName());
			}
			});
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println(g.getCount());
		
	}

}
