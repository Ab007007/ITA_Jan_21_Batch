package com.ita.training.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List al = new ArrayList();
		
		al.add(5);
		al.add(55.55);
		al.add("temp");
		al.add(true);
		
		printListElements(al);
		
		al.add(0, "Aravinda");
		
		printListElements(al);
		
		al.remove(55.55);
		printListElements(al);
		
		printUsingIterator(al);
		
		
	}

	private static void printUsingIterator(List al) {
		System.out.println("Total size of List is Printed by Iterator " + al.size());
		System.out.println("------------------------------------------------");
		Iterator it =  al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("------------------------------------------------");
		
	}

	private static void printListElements(List al) {
		System.out.println("Total size of List is " + al.size());
		System.out.println("------------------------------------------------");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println("Element at index " + i + " is " + al.get(i));
		}
		System.out.println("------------------------------------------------");
	}
	
	
	private static void printListUsingEForLoog(List al) {
		System.out.println("Total size of List is Printed using ForEach loop " + al.size());
		System.out.println("------------------------------------------------");
		for (Object obj : al) {
			System.out.println(obj);
			
		}
		System.out.println("------------------------------------------------");
	}
}
