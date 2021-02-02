package com.ita.training.java.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("ABC");
//		System.out.println(sb);
//		System.out.println(sb.hashCode());
//		
//		sb.append("123");
//		System.out.println(sb);
//		System.out.println(sb.hashCode());
		String emailSTr = "aru03.info@gmail.com";
		StringBuffer email = new StringBuffer(emailSTr);
		System.out.println("char at index-10 " + email.charAt(10));
		System.out.println("index of a " + email.indexOf("a"));
		System.out.println("index of a from first index " + email.indexOf("a", 1));

		System.out.println("last index of a " + email.lastIndexOf("a"));
		System.out.println("last index of a " + email.lastIndexOf("a", 12));

		
		System.out.println("substring " + email.substring(0,email.indexOf("@")));
		System.out.println("------------Array----------------");
		
		System.out.println("Length " + email.length());
		
		System.out.println(email.equals("aru03.info@gmail.com"));
		String temp = "   abc   ".trim();
		System.out.println(temp.length());
		
		//System.out.println(email.reverse());
		System.out.println(email.capacity());
		
		email.insert(email.length(), "ADFADSF");
		System.out.println(email);
		email.delete(email.indexOf("com")+3 , email.length());
		System.out.println(email);
	
		email.replace(0, 1, "A");
		System.out.println(email);
	
	
	
	
	
	
	
	
	
	
	
	}
}
