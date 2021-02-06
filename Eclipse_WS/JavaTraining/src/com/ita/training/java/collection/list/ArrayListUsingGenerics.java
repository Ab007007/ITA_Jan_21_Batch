package com.ita.training.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListUsingGenerics {

	public static void main(String[] args) {
		
		//List al = new ArrayList();
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(55);
		al.add(52);
		al.add(51);
		
		printUsingIterator(al);
		
		
	}

	private static void printUsingIterator(List<Integer> al) {
		System.out.println("Total size of List is Printed by Iterator " + al.size());
		System.out.println("------------------------------------------------");
		Iterator<Integer> it =  al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("------------------------------------------------");
		
	}

	private static void printListElements(List<Integer> al) {
		System.out.println("Total size of List is " + al.size());
		System.out.println("------------------------------------------------");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println("Element at index " + i + " is " + al.get(i));
		}
		System.out.println("------------------------------------------------");
	}
	
	
	private static void printListUsingEForLoog(List<Integer>  al) {
		System.out.println("Total size of List is Printed using ForEach loop " + al.size());
		System.out.println("------------------------------------------------");
		for (Integer obj : al) {
			System.out.println(obj);
			
		}
		System.out.println("------------------------------------------------");
	}
}
