package com.ita.training.java.loop;

public class TablesUsingLoops {

	static int number = 32;

	public static void main(String[] args) {
		
//		
//		for (int i = 1; i <=10 ; i++) {
//			System.out.println(number + " * " + i + " = " + (number*i));
//		}
		
		
//		int i = 1;
//		while (i<=10) 
//		{
//			System.out.println(number + " * " + i + " = " + (number*i));
//			i++;
//		}
		
		int i=1;
		do
		{
				System.out.println(number + " * " + i + " = " + (number*i));
				i++;
		}while (i<=-10);
		
	}
}
