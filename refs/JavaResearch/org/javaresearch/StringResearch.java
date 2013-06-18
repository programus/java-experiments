/*
 * Created on 2004/12/30
 */
package org.javaresearch;


/**
 * Research methods of String. 
 * 
 * @author Wang_Yuan
 */
public class StringResearch {

	public static void main(String[] args) {
		// About String == String and String equals String
		String s1 = "ABC"; 
		String s2 = "ABC "; 
		String s3 = "ABC"; 
		String s4 = s2.trim();
		String s5 = new String("ABC"); 
		String s6 = "BBB"; 
		s6 = new String("ABC"); 
		System.out.println("\"ABC\" == new String(\"ABC \")?"); 
		System.out.println(s1 == s5); 
		System.out.println("\"ABC\" == TRIM(\"ABC \")?"); 
		System.out.println(s1 == s4);
		System.out.println("\"ABC\" equals TRIM(\"ABC \")?"); 
		System.out.println(s1.equals(s4)); 
		System.out.println("\"ABC\" == \"ABC\"?");
		System.out.println(s1 == s3);
		
		//////////////////////////////////////////////////////////////
	}
}
