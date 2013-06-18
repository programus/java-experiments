package com.ibm.javacore.exception.trylocation.thrownew;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryLocation {
	
    private static String INTERNAL_FILE_NAME = "D:\\tmp\\number.txt"; 
    public static double readNumberFromFile(String fileName) throws Exception {
        BufferedReader reader = null; 
        double number; 
        try {
            try {
                reader = new BufferedReader(new FileReader(fileName)); 
            } catch (FileNotFoundException e) {
                fileName = INTERNAL_FILE_NAME; 
                reader = new BufferedReader(new FileReader(fileName)); 
            }
            String line = reader.readLine(); 
            number = Double.parseDouble(line.trim()); 
        } catch (Exception e) {
            throw new Exception("Error file: " + fileName, e); 
        } finally {
            if (reader != null)
                reader.close(); 
        }
        return number; 
    }

    public static void main(String[] args) {
    }

}
