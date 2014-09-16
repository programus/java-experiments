package com.ibm.javabasic.research._06_string;

import java.lang.ref.WeakReference;
/**
 * Class to research strings. 
 * constant string like "AAA" won't be reclaimed while instance created by new will. 
 * when you new a String by a constant string, there will be two memory field stored the same value. 
 * so initialize a String by constant String is recommended. 
 * @author Wang Yuan
 */
public class NewOrNot {

	public static void main(String[] args) {
		String a = "AAA"; 
		String b = new String("AAA"); 

		WeakReference wra = new WeakReference(a); 
		WeakReference wrb = new WeakReference(b); 
		
		a = null; 
		b = null; 

		System.gc(); 
		
		System.out.println(wra.get()); 
		System.out.println(wrb.get()); 		
		System.out.println(a);
		System.out.println(b);
	}

}
