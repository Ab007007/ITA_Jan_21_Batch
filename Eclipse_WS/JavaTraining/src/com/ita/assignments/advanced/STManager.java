package com.ita.assignments.advanced;

public class STManager {

	
	public static void main(String[] args) {
		
		
		SingleTonDesignPattern st1 = SingleTonDesignPattern.getInstance();
		SingleTonDesignPattern st2 = SingleTonDesignPattern.getInstance();
		SingleTonDesignPattern st3 = SingleTonDesignPattern.getInstance();
		SingleTonDesignPattern st4 = SingleTonDesignPattern.getInstance();
		
		
		st1.greetings();
		st2.greetings();
		st3.greetings();
		st4.greetings();
	}
}
