package com.ibm.javacore.exception.trylocation.defaultzero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryLocation {
	
    public static double readNumberFromFile(String fileName) {
        BufferedReader reader = null; 
        double number = 0.; // default value.  
        try {
            reader = new BufferedReader(new FileReader(fileName)); 
            String line = reader.readLine(); 
            number = Double.parseDouble(line.trim()); 
        } catch (Exception e) {
        } finally {
            if (reader != null) {
                try {
                    reader.close(); 
                } catch (IOException e) {}
            }
        }
        return number; 
    }

    public static void main(String[] args) {
    }

}
