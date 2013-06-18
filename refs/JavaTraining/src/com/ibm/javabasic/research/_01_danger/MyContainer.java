package com.ibm.javabasic.research._01_danger;

import java.util.LinkedList;
import java.util.List;

public class MyContainer implements Container {
	
	private static List resourcePool = new LinkedList(); 
	
	private static MyContainer me = new MyContainer(); 
	
	private Resource resource; 
	
	private MyContainer() {
	}
	
	public static MyContainer getInstance() {
		return me; 
	}
	
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	public Resource getResource() {		
		return this.resource; 
	}
	
	public void returnResource(Resource res) {
		resourcePool.add(res); 
	}

}
