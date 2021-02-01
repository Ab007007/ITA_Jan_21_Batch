package com.ita.assignments;

import java.util.Scanner;

public class KeyBoardInputDemo {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Welcome to Addition of 2 numers");
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		
		System.out.println("sum of two numbers is " + (a+b));
				
	}

}
