package com.ibm.javabasic.research._11_collections.list;

import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTester {
	
	public static List getList(int size) {
		List list = new LinkedList(); 
		
		final String element = "element"; 
		
		for (int i = 0; i < size; i++) {
			list.add(element); 
		}
		
		return list; 
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = getList(70000); 
		
		long startTime = 0; 
		long endTime = 0; 
		
		// get current time as start time. 
		startTime = Calendar.getInstance().getTimeInMillis();
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i); 
		}
		
		// get current time as end time. 
		endTime = Calendar.getInstance().getTimeInMillis(); 
		// print out the result. 
		System.out.println("Initialize LinkedList start: " + startTime);
		System.out.println("Initialization time: " + (endTime - startTime)); 
		System.out.println("Initialize LinkedList end: " + endTime);
		System.out.println(); 
		
		// get current time as start time. 
		startTime = Calendar.getInstance().getTimeInMillis();
		
		for (Iterator it = list.iterator(); it.hasNext(); ) {
			it.next(); 
		}
		
		// get current time as end time. 
		endTime = Calendar.getInstance().getTimeInMillis(); 
		// print out the result. 
		System.out.println("Initialize ArrayList start: " + startTime);
		System.out.println("Initialization time: " + (endTime - startTime)); 
		System.out.println("Initialize ArrayList end: " + endTime);
		System.out.println("Memory used: "); 
		System.out.println(); 
	}

}
