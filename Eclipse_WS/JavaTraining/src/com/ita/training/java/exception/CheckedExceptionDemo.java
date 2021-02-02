package com.ita.training.java.exception;

public class CheckedExceptionDemo 
{
	
	public static void main(String[] args) 
	{
		System.out.println("---main started---");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
			System.out.println("Catch block");
		}
		System.out.println("---main ended---");
		
	}

}
