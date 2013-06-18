package com.ibm.javabasic.research._09_intfc;

public class Main {
	public static void main(String[] args) {
		
		Interface i = new Interface() {
			public void method() {
				System.out.println("method. "); 
			}
		}; 
		
		i.method(); 
	}

}
