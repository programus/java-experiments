package com.ibm.javacore.collections.collection;

import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void printAll(Collection c) {
		for (Object e : c) {
			System.out.println(e); 
		}
	}
	
	public static void printIteratorAll(Collection c) {
		for (Iterator it = c.iterator(); it.hasNext();) {
			Object e = it.next(); 
			System.out.println(e); 
		}
	}
}
