package com.ita.training.java.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		
		Map mp = new TreeMap();
		
		mp.put("name", "");
		mp.put("age", "33");
		mp.put("place", "India");
		mp.put("mobile", "9999898989");
		
		System.out.println(mp.size());
		
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		
		while (it.hasNext()) {
			
			Object key = it.next();
			System.out.println(key + " : " + mp.get(key));
		}
	}

}
