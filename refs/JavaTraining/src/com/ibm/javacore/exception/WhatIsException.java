package com.ibm.javacore.exception;

import java.util.Random;

public class WhatIsException {
	
	public static void func_exception() {
		int i = 4 / new Random().nextInt(2); 
//		throw new RuntimeException("What is Exception? "); 
	}
	
	public static void func_no_catch() {
		func_exception(); 
	}
	
	public static void func_catch() {
		try {
			func_no_catch(); 
		} catch (RuntimeException e) {
			System.out.println("Exception is processed here: " + e); 
		}
	}

	public static void main(String[] args) {
		func_catch(); 
		System.out.println("Finished! "); 
	}

}
