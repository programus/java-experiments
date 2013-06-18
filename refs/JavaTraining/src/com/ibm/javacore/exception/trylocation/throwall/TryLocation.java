package com.ibm.javacore.exception.trylocation.throwall;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryLocation {
	
	public static double readNumberFromFile(String fileName) 
	                         throws IOException, NumberFormatException {
		BufferedReader reader = null; 
		double number; 
		try {
			reader = new BufferedReader(new FileReader(fileName)); 
			String line = reader.readLine(); 
			number = Double.parseDouble(line.trim()); 
		} finally {
			if (reader != null)
				reader.close(); 
		}
		return number; 
	}

	public static void main(String[] args) {
	}

}
