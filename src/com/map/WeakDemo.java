package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Hello{

	@Override
	public String toString() {
		return "Hello []";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalise method");
	}
}
public class WeakDemo {

	public static void main(String[] args) throws InterruptedException {
//		Map<Object,String> m=new HashMap<>();
		Map<Object,String> m=new WeakHashMap<>();
	
		Hello h=new Hello();
		m.put(h, "java");
		System.out.println(m);
		h=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(m);
		

	}

}
