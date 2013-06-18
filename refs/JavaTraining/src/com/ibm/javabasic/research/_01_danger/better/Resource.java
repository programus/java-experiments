package com.ibm.javabasic.research._01_danger.better;

public class Resource {

	String value;
	
	public Resource() {
	}
	
	public Resource(String name) {
		this.value = name; 
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String name) {
		this.value = name; 
	}
}
