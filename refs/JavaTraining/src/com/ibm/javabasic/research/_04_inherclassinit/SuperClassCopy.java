package com.ibm.javabasic.research._04_inherclassinit;

public class SuperClassCopy {
	static {
		System.out.println("static block in SuperClassCopy"); 
	}
	
	public SuperClassCopy() {
		System.out.println("constructor in SuperClassCopy"); 
	}
	
	public static void staticMethod() {
		System.out.println("static method in SuperClassCopy"); 
	}
	
	{
		System.out.println("initializer block in SuperClassCopy"); 
	}
	
	private static int si = TestHelper.getInt("static member variable in SuperClassCopy");
	 
	private int i = TestHelper.getInt("property in SuperClassCopy"); 
	
}
