package com.ita.training.java.array;

public class ArraysDemo {
	
	
	
	public static void main(String[] args) 
	{
		int marks[] = new int[6];
		marks[0] = 35;
		marks[1] = 45;
		marks[2] = 55;
		marks[3] = 65;
		marks[4] = 35;
		marks[5] = 75;
		
		
		for (int i = 0; i < marks.length; i++) 
		{
			System.out.println("Subject " + (i+1) + " has " + marks[i] + " marks");
		}
	}

}
