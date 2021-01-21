package com.ita.training.java.methods;

public class StaticAddition {
	// static method without return type and no arguments
	static void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Sum of two numbers is " + c);
	}

	// static method with return type and no arguments
	static int sub() {
		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println("Sub of two numbers is " + c);
		return c;
	}

	// static method with return type and with arguments
	static int multi(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication of two numbers is " + c);
		return c;
	}

	// static method without return type and with arguments
	static void division(int a, int b) {
		int c = a / b;
		System.out.println("Multiplication of two numbers is " + c);
		
	}

	public static void main(String[] args) {

		System.out.println("--- Welcom to Addition program ---");
		StaticAddition.sum();
		int c = sub();
		System.out.println("multiplied by 100 method " + c * 100);

		int d = multi(5, 5);
		System.out.println("multiplication value from main " + d);

		System.out.println("--- Ended ---");
	}
}
