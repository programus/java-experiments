package com.ibm.javabasic.research._00_ref;

import java.util.HashMap;
import java.util.Map;

public class RefTester {
	
	private static final String az = "opqrst"; 

	public static Map getMap() {
		Map map = new HashMap(); 
		for (int i = 0; i < az.length(); i++) {
			map.put(az.substring(i, i+1), new User(az.substring(i,i+1).toUpperCase())); 
			map.put(az.substring(i, i+1).toUpperCase(), az.substring(i, i+1)); 
		}
		return map; 
	}
	
	public static void main(String[] args) {
		// Is the code below good? If not, why? 
		Map map = new HashMap(); 
		map = getMap(); 
		
		System.out.println("The map is:"); 
		System.out.println(map); 
		
		
		User u = (User) map.get("q"); 
		u.setName("qq"); 
		// What is the output here? 
		System.out.println("Key=\"q\", Value=" + map.get("q")); 

		
		String s = (String) map.get("Q"); 
		s = "QQ"; 
		// What is the output here? 
		System.out.println("Key=\"Q\", Value=" + map.get("Q")); 
		
		// What's the different? And why? 
	}
}
