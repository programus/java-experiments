package com.ibm.javabasic.research._00_ref.e2;

public class TestPrint {

	public static void main(String[] arg) {

		// What's the output? And why? 
		String a = "AAA";
		String b = "BBB";
		String c = a;
		
		a = b; 
		b = c; 
		
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
	}

	public String changeString(String s) {
		String temp = "changedString";
		s = temp;
		return s; 
	}
}
