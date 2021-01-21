package com.ita.training.java.methods;

public class Addition
{
	//non-static method without return type and no arguments
	void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Sum of two numbers is " + c);
	}
	//non-static method with return type and no arguments
	int sub() {
		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println("Sub of two numbers is " + c);
		return c;
	}

	//non-static method with return type and with arguments
	int multi(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication of two numbers is " + c);
		return c;
	}
	public static void main(String[] args) {
		
		System.out.println("--- Welcom to Addition program ---");
		Addition ad  = new Addition();
		ad.sum();
		int c = ad.sub();
		System.out.println("multiplied by 100 method " + c*100);
		
		int d = ad.multi(5, 5);
		System.out.println("multiplication value from main " + d);
		
		
		
		System.out.println("--- Ended ---");
	}
}
