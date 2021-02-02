package com.ita.training.java.strings;

public class StringFunctions {

	public static void main(String[] args) {

		String email = "aru03.info@gmail.com";

		System.out.println("char at index-10 " + email.charAt(10));
		System.out.println("index of a " + email.indexOf("a"));
		System.out.println("index of a from first index " + email.indexOf("a", 1));

		System.out.println("last index of a " + email.lastIndexOf("a"));
		System.out.println("last index of a " + email.lastIndexOf("a", 12));

		System.out.println(email.toUpperCase());
		System.out.println(email.toLowerCase());
		
		System.out.println("substring " + email.substring(0,email.indexOf("@")));
		System.out.println("------------Array----------------");
		String[] emailPart = email.split("\\.");
		
		for (String e : emailPart) {
			System.out.println(e);
			
		}
		
		System.out.println("Length " + email.length());
		
		System.out.println(email.equals("aru03.info@gmail.com"));
		System.out.println(email.equalsIgnoreCase("Aru03.info@gmail.com"));
		System.out.println(email.replace("m", "M"));
		String temp = "   abc   ".trim();
		System.out.println(temp.length());
	}
}
