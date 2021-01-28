package com.ita.training.java.access.initblock;

public class StaticInitializationDemo
{
	
	static
	{
		System.out.println("i'm executing before main");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Java Program");
	}

}
