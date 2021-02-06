package com.ita.training.java.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set set = new LinkedHashSet();

		set.add("abc");
		set.add(123);
		set.add(123.22);
		set.add("pqr");

		printSetElements(set);
		
		set.add("pqr");
		printSetElements(set);

		set.remove("pqr");
		printSetElements(set);
	}

	private static void printSetElements(Set set) {
		System.out.println("Total size of Set " + set.size());
		System.out.println("------------------------------------");
		for (Object object : set) {

			System.out.println(object);
		}
		System.out.println("------------------------------------");
		
	}
}
