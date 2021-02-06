package com.ita.assignments;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello All, Bye bye to JAVA";
		
		String[] words = str.split(" ");
		for(String word:words)
		{
			System.out.println(word);
		}
		
				
		for (int i = 0; i < words.length; i++) 
		{
			stringRev(words[i] + " ");
			//System.out.print(" ");
		}
		
		//stringRev(str);
		
	}

	private static void stringRev(String str) {
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
			
		}
	}
}
