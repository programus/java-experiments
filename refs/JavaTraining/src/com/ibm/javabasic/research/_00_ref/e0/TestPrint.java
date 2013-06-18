package com.ibm.javabasic.research._00_ref.e0;

public class TestPrint {

	public static void main(String[] arg) {

		// What's the output? And why? 
		String a = "AAA";
		String b = "BBB";
		String c = a;

		TestPrint test = new TestPrint();
		test.changeString(a);
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
	}

	public void changeString(String s) {
		String temp = "changedString";
		s = temp;
	}
}
