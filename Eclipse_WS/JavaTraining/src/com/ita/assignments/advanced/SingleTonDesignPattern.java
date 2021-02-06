package com.ita.assignments.advanced;

public class SingleTonDesignPattern {
	
	private static SingleTonDesignPattern st = new SingleTonDesignPattern();
	
	private SingleTonDesignPattern()
	{
		System.out.println("Constructor called!!!");
	}

	
	public static SingleTonDesignPattern getInstance()
	{
		return st;
	}
	
	public void greetings()
	{
		System.out.println("Hello SingleTon");
	}
}
