package com.ita.training.java.methods;

public class OverLoadingDemo {

	// Overloading - 2 or more functions having same name
	// but different signature - 1. Number of arguments
	// 2. type of arguments 3. order of arguments 4. RETURN TYPE IS NOT PART OF SIGNATURE
	
	static void sum(int a, int b)
	{
		System.out.println(a +" + " + b + " = " + (a+b));
		
	}

	static void sum(double a, double b)
	{
		System.out.println(a +" + " + b + " = " + (a+b));
		
	}

	static void sum(double a, double b, double c)
	{
		System.out.println(a +" + " + b +" + " + c + " = " + (a+b+c));
		
	}
	
	static void sum(String a, String b)
	{
		System.out.println(a +" + " + b + " = " + (a+b));
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("--- welcome to overloading ---");
		sum(10, 20);
		sum(10.5, 20.5);
		sum(10.5, 20.5, 25.5);
		sum(10.5,20);   //AutoType casting
		sum("Aravinda ", "HB");
	}
}
