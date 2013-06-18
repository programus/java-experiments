package com.ibm.javabasic.research._03_inheritance;

public class InhTester {

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass(); 
		SuperClass suClass = new SubClass();
		SubClass subClass = new SubClass(); 
		
		System.out.println("class members, called by class"); 
		System.out.println("SuperClass.si: " + SuperClass.si); 
		System.out.println("SubClass.si: " + SubClass.si); 
		System.out.println("SuperClass.staticMethod(): " + SuperClass.staticMethod()); 
		System.out.println("SubClass.staticMethod(): " + SubClass.staticMethod()); 
		printSep(); 
		
		System.out.println("instance member functions. "); 
		System.out.println("superClass.method(): " + superClass.method()); 
		System.out.println("suClass.method(): " + suClass.method()); 
		System.out.println("subClass.method(): " + subClass.method()); 
		printSep(); 
		
		// Notice: it is not recommended that invoke a static members by reference. 
		// This is just a example to show what will happen. 
		// Please invoke static members by Class Name in your program. 
		System.out.println("class member functions, called by references"); 
		System.out.println("superClass.staticMethod(): " + superClass.staticMethod()); 
		System.out.println("suClass.staticMethod(): " + suClass.staticMethod()); 
		System.out.println("subClass.staticMethod(): " + subClass.staticMethod()); 
		printSep(); 

		System.out.println("instance member variables"); 
		System.out.println("superClass.i: " + superClass.i); 
		System.out.println("suClass.i: " + suClass.i); 
		System.out.println("subClass.i: " + subClass.i); 
		printSep(); 
		
		// Notice: it is not recommended that invoke a static members by reference. 
		// This is just a example to show what will happen. 
		// Please invoke static members by Class Name in your program. 
		System.out.println("calss member variables, called by references"); 
		System.out.println("superClass.si: " + superClass.si); 
		System.out.println("suClass.si: " + suClass.si); 
		System.out.println("subClass.si: " + subClass.si); 
	}
	
	public static void printSep() {
		System.out.println("========================="); 
	}
}
