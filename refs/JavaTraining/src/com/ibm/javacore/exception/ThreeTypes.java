package com.ibm.javacore.exception;

public class ThreeTypes {
	public static void throwError() {
		throw new Error("Just an error. "); 
	}
	
	public static void throwRuntimeException() {
		throw new RuntimeException("Just a runtime exceptioin"); 
	}
	
	public static void throwCheckedException() throws Exception {
		throw new Exception("This is an exception. "); 
	}
	
	public static void main(String[] args) {
		throwError(); 
		throwRuntimeException(); 
		
		try {
			throwCheckedException();
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
