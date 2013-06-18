package com.ibm.javabasic.research._02_array;

public class InitArray {
	public static void main(String[] args) {
		final int N = 3; 
		User[] u = new User[N]; 
		for (int i = 0; i < u.length; i++) {
			// What's the output here? 
			System.out.println(u[i].getName()); 
		}
	}
}
