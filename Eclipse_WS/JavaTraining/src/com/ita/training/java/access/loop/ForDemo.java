package com.ita.training.java.access.loop;

public class ForDemo {
	
	
	public static void main(String[] args) {
		
		int marks[] = {55,85,98,75,77};
		
		
		System.out.println(marks.length + "is the total number of elements");
		for (int i = 0; i < marks.length; i++) 
		{
			System.out.println(marks[i]);
		}
	
		System.out.println("------------------------------");
		for (int i = marks.length-1; i >=0 ; i--)
		{
			System.out.println(marks[i]);
		}
	}

}
