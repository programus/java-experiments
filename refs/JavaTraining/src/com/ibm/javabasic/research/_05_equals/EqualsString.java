package com.ibm.javabasic.research._05_equals;

public class EqualsString {
	public static void printEqualsIBM(String s) {
//		if ("IBM".equals(s)) {		// <- Is this much better? 
		if (s.equals("IBM")) {		// <- Is this the best? 
			System.out.println("Yes, it is IBM. "); 
		}
		else {
			System.out.println("No, it isn't IBM. It is " + s); 
		}
	}
	
	public static void main(String[] args) {
		
		// what's the output of the source section below? 
		String s1 = "string"; 
		String s2 = "string"; 
		String s3 = new String("string"); 
		String s4 = "string123".substring(0, "string".length()); 

		System.out.println(">> == <<"); 
		System.out.println(s1 == s2); 
		System.out.println(s1 == s3); 
		System.out.println(s1 == s4); 
		System.out.println(s2 == s3); 
		System.out.println(s2 == s4); 
		System.out.println(s3 == s4); 
		System.out.println(">> equals() <<"); 
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equals(s3)); 
		System.out.println(s1.equals(s4)); 
		System.out.println(s2.equals(s3)); 
		System.out.println(s2.equals(s4)); 
		System.out.println(s3.equals(s4)); 
	}
}
