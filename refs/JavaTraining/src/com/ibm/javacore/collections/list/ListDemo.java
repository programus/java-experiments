package com.ibm.javacore.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void subListDemo() {
		List<String> l = new ArrayList<String>(); 
		for (int i = 0; i < 32; i++) {
			l.add(Integer.toHexString(i)); 
		}
		System.out.println("size: " + l.size()); 
		
		l.subList(0x05, 0x0a).clear(); 
		System.out.println("size: " + l.size()); 
		for (String e : l) {
			System.out.println(e); 
		}
	}
	
	public static void main(String[] args) {
		subListDemo(); 
	}
}
