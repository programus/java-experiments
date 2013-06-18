package com.ibm.javabasic.research._00_ref.better;

public class User {

	private String name;
	
	public User() {
	}
	
	public User(String name) {
		this.name = name; 
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String toString() {
		return "Name(" + this.name + ")";  
	}
}
