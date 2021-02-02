package com.ita.training.java.exception;

public class RunTimeExceptionDemo {
	
	public static void main(String[] args) {
		
		String names[] = new String[2];
		String country = null;
		try
		{
			System.out.println(country.length());
		}
		catch(NullPointerException ex)
		{
			System.out.println("Null pointer excepiton , please check the string value!!!!" + ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("base class");
		}
		
		
		try
		{
			names[0] = "Ravi";
			names[1] = "AHB";
			names[2] = "ITA";
		}
		catch(ArrayIndexOutOfBoundsException ex )
		{
			System.out.println("Exception while storing the elements  to an array.." + ex.getMessage());
		}
		
		for (int i = 0; i < names.length; i++) 
		{
			System.out.println(names[i]);
		}
		
		System.out.println("---main ended---");
	}

}
