package com.ibm.javabasic.research._01_danger.better;

import java.util.LinkedList;
import java.util.List;

public class MyContainer implements Container {
	
	private static List resourcePool = new LinkedList(); 
	
	private static MyContainer me = new MyContainer(); 
	
	private MyContainer() {
	}
	
	public static MyContainer getInstance() {
		return me; 
	}
	
	public Resource getResource() {
		if (resourcePool.isEmpty()) {
			return new Resource(); 
		} else {
			return (Resource) resourcePool.remove(0); 
		}
	}
	
	public void returnResource(Resource res) {
		resourcePool.add(res); 
	}

}
