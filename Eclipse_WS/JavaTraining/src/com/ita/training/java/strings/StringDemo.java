package com.ita.training.java.strings;

public class StringDemo {

	public static void main(String[] args) {

		String str1 = "ABC";
		String str2 = new String("ABC");

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		str2 = str2.concat("123");
		System.out.println(str2);

		System.out.println(str2.hashCode());
	}

}
