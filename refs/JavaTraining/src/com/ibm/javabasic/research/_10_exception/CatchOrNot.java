package com.ibm.javabasic.research._10_exception;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class CatchOrNot {
	public static void main(String[] args) {
		final String sampleString = "sample"; 
		
		Reader reader = new StringReader(sampleString); 
		try {
			for (int ch = reader.read(); ch >= 0; ch = reader.read()) {
				System.out.println(ch); 
			}
		}
		catch (IOException e) {
			// Why we have to deal with the exception here? 
			System.err.println("Exception is almost not impossible here!"); 
		}
		
		// Why this exception is no need to catch or throws? 
		throw new NullPointerException(); 
		
	}
}
