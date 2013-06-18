package com.ibm.javabasic.research._04_inherclassinit;

public class SubClass extends SuperClass {
	private static int subsi = TestHelper.getInt("static member variable in SubClass"); 
	
	private int subi = TestHelper.getInt("property in SubClass"); 
	
	static {
		System.out.println("static block in SubClass"); 
	}
	
	{
		System.out.println("initializer block in SubClass"); 
	}
	
	public SubClass() {
		System.out.println("constructor in SubClass"); 
	}
	
	public static void staticMethod() {
		System.out.println("static method in SubClass"); 
	}
}
