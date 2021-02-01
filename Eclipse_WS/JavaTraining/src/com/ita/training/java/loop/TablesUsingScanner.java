package com.ita.training.java.loop;

import java.util.Scanner;

public class TablesUsingScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = "no";
		do {
			System.out.println("Enter the number for which you want to generate table ");
			int number = sc.nextInt();
			for (int i = 1; i <=10 ; i++) 
			{
				System.out.println(number + " * " + i + " = " + (number * i));
			}
			System.out.println("Do you want to continue...?");
			choice = sc.next();
			
		} while (choice.equalsIgnoreCase("yes"));

		System.out.println("BYE BYE...");
	}
}
