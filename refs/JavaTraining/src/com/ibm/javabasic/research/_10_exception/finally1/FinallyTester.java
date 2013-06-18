package com.ibm.javabasic.research._10_exception.finally1;

public class FinallyTester {
	
	public static int func() {
		int i = 3; 
		try {
			i = 5; 
			// return here? 
			return i; 
			
		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			// Will this be execute? 
			i = 4; 
			System.out.println("Finally Block!" + i); // to find out whether finally block executed. 
		}
		
		return i; 
	}
	
	public static void main(String[] args) {
		System.out.println("return value: " + func()); 
	}

}
