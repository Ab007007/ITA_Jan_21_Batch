package com.ita.training.java.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set set = new TreeSet();

		set.add(25);
		set.add(55);
		set.add(15);
		set.add(85);
		printSetElements(set);
		
		set.add(55);
		printSetElements(set);

		set.remove(15);
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
