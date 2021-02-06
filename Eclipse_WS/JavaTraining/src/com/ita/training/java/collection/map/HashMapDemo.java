package com.ita.training.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		
		Map mp = new HashMap();
		
		mp.put("name", "Aravinda");
		mp.put("age", 33);
		mp.put("place", "India");
		mp.put("mobile", "9999898989");
		
		System.out.println(mp.size());
		
		mp.remove("name");
		
		System.out.println(mp.containsKey("name"));
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		
		while (it.hasNext()) {
			
			Object key = it.next();
			System.out.println(key + " : " + mp.get(key));
		}
	}

}
