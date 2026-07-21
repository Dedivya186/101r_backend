package com.app;
import com.calculator.Calculator;
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculator c=new Calculator();
      int a = 20, b = 10;
      
      System.out.println("Addition       : " + c.add(a, b));
      System.out.println("Subtraction    : " + c.sub(a, b));
      System.out.println("Multiplication : " + c.mul(a, b));
      System.out.println("Division       : " + c.div(a, b));
	}

}
