package com.ibm.javabasic.research._02_array.better;

public class UsersDAO {
	public User[] getUsers() {
		final int N = 5; 
		User[] u = new User[N]; 
		
		// modify all the users according to the real name. 
		for (int i = 0; i < u.length; i++) {
			// remember to initialize the elements in an array one by one! 
			u[i] = new User(); 
			u[i].setName("User" + i); 
		}
		
		return u; 
	}
}
