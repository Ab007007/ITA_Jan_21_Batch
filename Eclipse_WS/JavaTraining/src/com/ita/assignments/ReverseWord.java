package com.ita.assignments;

public class ReverseWord {
	static String str = "Hello All, is Java Programming is easy?";
	
	public static void main(String[] args) {

		String words[] = str.split(" ");
		
		for (String word : words) 
		{
			for (int i = word.length()-1; i >=0 ; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
	}
}
