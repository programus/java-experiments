package com.ibm.javabasic.research._00_ref.e3;

import com.ibm.javabasic.research._00_ref.User;

public class TestPrint {
	public static void main(String[] arg) {
		
		// What's the output? And why? 
		User a = new User("AAA");
		User b = new User("BBB");
		User c = a;
		
		TestPrint.changeUserName(a); 
		
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
	}
	public static void changeUserName(User user) {
		user.setName("changedName"); 
	}
}
