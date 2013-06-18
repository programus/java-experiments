package com.ibm.javabasic.research._01_danger.better;

public class DangerTester {
	
	public static void main(String[] args) {
		// some other codes...
		
		// At least write code like this. 
		Container container = MyContainer.getInstance(); 
		Resource res = container.getResource(); 
		String value = res.getValue(); 
		byte[] bytes = value.getBytes(); 
		int length = bytes.length; 
		// If Exception, at least you know where now. 
		
		// What is the output? 
		System.out.println(length); 
	}
}
