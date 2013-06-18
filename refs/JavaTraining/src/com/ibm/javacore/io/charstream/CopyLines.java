package com.ibm.javacore.io.charstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class CopyLines {
	public static void copyLines(String sourceFile, String targetFile, String charset) throws IOException {
		BufferedReader reader = null; 
		PrintWriter writer = null; 
		if (charset == null || Charset.isSupported(charset)) {
			charset = "UTF-8"; 
		}
		
		try {
			reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(sourceFile), charset)); 
			writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(targetFile), charset)); 
			
			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				writer.println(line); 
			}
		} finally {
			if (reader != null) {
				try {
					reader.close(); 
				} catch (IOException e) {}
			}
			if (writer != null) {
				writer.close(); 
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		String sourceFile = "D:\\tmp\\source.txt"; 
		String targetFile = "D:\\tmp\\target.txt"; 
		copyLines(sourceFile, targetFile, null); 
	}
}
