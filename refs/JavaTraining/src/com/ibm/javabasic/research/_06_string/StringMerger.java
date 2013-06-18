package com.ibm.javabasic.research._06_string;

import java.util.Calendar;

/**
 * This is a class to prove that merge strings by StringBuffer is quite quicker than String.  
 * 
 * @author Wang Yuan
 *
 */
public class StringMerger {
	/**
	 * Merge some strings into one string with the specified separator. 
	 * 
	 * @param strings An array of strings to be merged. 
	 * @param separator The separator should be place between strings in the new string. There will be no separator when give a null or "" here.  
	 * @param isSepAtTail Set if the separator will be append at the tail. 
	 * @return The merged string. Return null when the array of strings is null. 
	 */
	public static String merge(String[] strings, String separator, boolean isSepAtTail) {
		if (strings == null) {
			return null; 
		}
		if (separator == null) {
			separator = ""; 
		}
		
		String mergedString = new String(); 
		for (int i = 0; i < strings.length - 1; i++) {
			mergedString += (strings[i] + separator); 
		}
		
		mergedString += strings[strings.length - 1]; 
		if (isSepAtTail) {
			mergedString += separator; 
		}
		
		return mergedString; 
	}
	
	/**
	 * Merge some strings into one string with the specified separator. 
	 * 
	 * @param strings An array of strings to be merged. 
	 * @param separator The separator should be place between strings in the new string. There will be no separator when give a null or "" here.  
	 * @param isSepAtTail Set if the separator will be append at the tail. 
	 * @return The merged string. Return null when the array of strings is null. 
	 */
	public static String bufferMerge(String[] strings, String separator, boolean isSepAtTail) {
		if (strings == null) {
			return null; 
		}
		if (separator == null) {
			separator = ""; 
		}
		
		StringBuffer mergeSb = new StringBuffer(); 
		for (int i = 0; i < strings.length - 1; i++) {
			mergeSb.append(strings[i]).append(separator); 
		}
		
		mergeSb.append(strings[strings.length - 1]); 
		if (isSepAtTail) {
			mergeSb.append(separator); 
		}
		
		return mergeSb.toString(); 
	}
	
	public static void main(String[] args) {
		// call the two methods to initialize the class and methods. 
		System.out.println(StringMerger.merge(new String[] {"a", "kk", "ef"}, " ^_^ ", false)); 
		System.out.println(StringMerger.bufferMerge(new String[] {"a", "kk", "ef"}, " ^_^ ", false));
		
		final int n = 2000;
		final String sep = System.getProperty("line.separator");
		
		// create an array of String for merging.  
		String[] forMerge = new String[n]; 
		for (int i = 0; i < n; i++) {
			forMerge[i] = Integer.toBinaryString(i); 
		}
		
		// declare two variables to store start time and end time. 
		long startTime = 0; 
		long endTime = 0; 
		
		// run the test code 5 times. 
		for (int i = 0; i < 5; i++) {
			System.out.println("==="); 
			
			// get current time as start time. 
			startTime = Calendar.getInstance().getTimeInMillis();
			// merge string by using String. 
			StringMerger.bufferMerge(forMerge, sep, false);
			// get current time as end time. 
			endTime = Calendar.getInstance().getTimeInMillis();
			// print out the result. 
			System.out.println("merge by StringBuffer start: " + startTime);
			System.out.println("merge time: " + (endTime - startTime)); 
			System.out.println("merge by StringBuffer end: " + endTime);
			
			// get current time as start time. 
			startTime = Calendar.getInstance().getTimeInMillis();
			// merge string by using StringBuffer. 
			StringMerger.merge(forMerge, sep, false);
			// get current time as end time. 
			endTime = Calendar.getInstance().getTimeInMillis();
			// print out the result. 
			System.out.println("merge by String start: " + startTime);
			System.out.println("merge time: " + (endTime - startTime)); 
			System.out.println("merge by String end: " + endTime);
		}
	}
}
