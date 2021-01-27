package com.ita.training.java.accessmodifier;

public class StaticDemo {

	String name;
	double salary;
	static String company = "Wipro";
	
	
	
	static void test() {
		System.out.println( " Test method");
	}
	
	
	
	public static void main(String[] args) {
		// variables or methods
		
		StaticDemo st1 = new StaticDemo();
		st1.name = "AHB";
		st1.salary = 2700;
		System.out.println(st1.name + " : " + st1.salary + " : " + company);
		StaticDemo.test();
				
	}
}
