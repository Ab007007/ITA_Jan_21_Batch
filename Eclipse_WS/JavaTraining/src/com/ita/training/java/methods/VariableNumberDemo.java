package com.ita.training.java.methods;

public class VariableNumberDemo
{

	// To Avoid restricting user to pass the number of arguments
	// we can go with variable number of arguments
	
	/*
	 * void sum() {
	 * 
	 * } void sum(int a) {
	 * 
	 * } void sum(int a, int b) {
	 * 
	 * }
	 * 
	 * void sum(int a, int b, int c) {
	 * 
	 * }
	 * 
	 * void sum(int a, int b, int c, int d){
	 * 
	 * }
	 */
	
	static void print(int... a) {
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
				
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		print();
		print(10);
		print(10,20);
		print(10,20,30);
		print(10,20,30,40);
		
	}
	
	
	
	
	
	
	
	
	
	
}
