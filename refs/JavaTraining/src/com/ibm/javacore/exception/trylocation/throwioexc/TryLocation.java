package com.ibm.javacore.exception.trylocation.throwioexc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryLocation {

	public static double readNumberFromFile(String fileName) 
	                                        throws IOException {
	    BufferedReader reader = null; 
	    String line; 
	    try {
	        reader = new BufferedReader(new FileReader(fileName)); 
	        line = reader.readLine(); 
	    } finally {
	        if (reader != null)
	            reader.close(); 
	    }
	    double number; 
	    try {
	        number = Double.parseDouble(line.trim());
	    } catch (NumberFormatException e) {
	        number = 0.; // default value. 
	    } 
	    return number; 
	}

    public static void main(String[] args) {
    }

}
