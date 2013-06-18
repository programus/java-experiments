package com.ibm.javabasic.research._01_danger;

public class DangerTester {
	
	public static void main(String[] args) {
		// some other codes...
		
		// Look at the code below. 
		int length = MyContainer.getInstance().getResource().getValue().getBytes().length; 
		// What is the output? 
		System.out.println(length); 
	}
}
