package com.ita.training.java.exception;

import java.util.Scanner;

public class DebitFunctionality {
	
	static int balance = 10000;
	
	
	public static void main(String[] args) {
		
		int amount;
		int tempBalance;
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the amount you want to withdraw");
			amount = sc.nextInt();
			tempBalance = balance - amount ; 
			if(tempBalance<0) 
			{
				try 
				{
					throw new Exception("Insufficient Funds ");
				} 
				catch (Exception e) {
					System.out.println("you have only " + balance + " in your account!!!");
				}
			}
			else {
				balance = tempBalance;
				System.out.println("you withdraw " + amount + " and your current balance is " + balance);
			}
			System.out.println("Do you want to perform one more transaction - Enter Yes / No");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("BYE BYE");
	
	}

}
