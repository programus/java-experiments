package com.ibm.javabasic.research._02_array;

/**
 * A Class just for test codes. 
 * @author Wang_Yuan
 *
 */
public class ArrayTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UsersDAO dao = new UsersDAO(); 
		User[] users = dao.getUsers(); 
		
		for (int i = 0; i < users.length; i++) {
			// What is the output here? 
			System.out.println("User " + i + "'s name is " + users[i].getName()); 
		}
	}

}
