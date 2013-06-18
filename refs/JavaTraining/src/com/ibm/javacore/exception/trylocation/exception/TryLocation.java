package com.ibm.javacore.exception.trylocation.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryLocation {
	
	public static double readNumberFromFile(String fileName) {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line = reader.readLine();
		double number = Double.parseDouble(line.trim());
		reader.close();
		return number; 
	}

	public static void main(String[] args) {
	}

}
