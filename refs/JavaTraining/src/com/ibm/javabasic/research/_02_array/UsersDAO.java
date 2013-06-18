package com.ibm.javabasic.research._02_array;

public class UsersDAO {
	public User[] getUsers() {
		final int N = 5; 
		User[] u = new User[N]; 
		// initialize the 1st element in the array. 
		u[0] = new User("User"); 
		
		// initialize all the users by using user
		java.util.Arrays.fill(u, u[0]); 
		// the method above just do the same as below. 
//		for (int i = 0; i < u.length; i++) {
//			u[i] = u[0]; 
//		}

		// modify all the users according to the real name. 
		for (int i = 0; i < u.length; i++) {
			u[i].setName("User" + i); 
		}
		
		return u; 
	}
}
