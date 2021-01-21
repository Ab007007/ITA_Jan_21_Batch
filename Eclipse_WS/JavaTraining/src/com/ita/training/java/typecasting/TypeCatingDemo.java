package com.ita.training.java.typecasting;

public class TypeCatingDemo {

	
	
	public static void main(String[] args) {
		int a = 10;
		
		double d = a; //Auto typeCasting
		
		System.out.println(d);
		
		double d1 = 10.5;
		int a1 = (int)d; //explict type Casting
		System.out.println(a1);
	}
}
