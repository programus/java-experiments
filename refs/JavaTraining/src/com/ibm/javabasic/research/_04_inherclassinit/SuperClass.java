package com.ibm.javabasic.research._04_inherclassinit;

public class SuperClass {
	private static int si = TestHelper.getInt("static member variable in SuperClass"); 
	
	private int i = TestHelper.getInt("property in SuperClass"); 
	
	static {
		System.out.println("static block in SuperClass"); 
	}
	
	{
		System.out.println("initializer block in SuperClass"); 
	}
	
	public SuperClass() {
		System.out.println("constructor in SuperClass"); 
	}
	
	public static void staticMethod() {
		System.out.println("static method in SuperClass"); 
	}
}
