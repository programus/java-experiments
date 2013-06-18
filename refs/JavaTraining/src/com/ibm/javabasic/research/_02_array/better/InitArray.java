package com.ibm.javabasic.research._02_array.better;

public class InitArray {
	public static void main(String[] args) {
		final int N = 3; 
		User[] u = new User[N]; 
		for (int i = 0; i < u.length; i++) {
			// Never forget to create new instances for all elements in an array. 
			u[i] = new User(); 
			System.out.println(u[i].getName()); 
		}
	}
}
