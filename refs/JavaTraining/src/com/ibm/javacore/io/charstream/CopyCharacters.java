package com.ibm.javacore.io.charstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CopyCharacters {
	public static void copyCharacters(String sourceFile, String targetFile, String charset) throws IOException {
		InputStreamReader reader = null; 
		OutputStreamWriter writer = null; 
		if (charset == null || Charset.isSupported(charset)) {
			charset = "UTF-8"; 
		}
		
		try {
			reader = new InputStreamReader(new FileInputStream(sourceFile), charset); 
			writer = new OutputStreamWriter(new FileOutputStream(targetFile), charset); 
			int c; 
			while ((c = reader.read()) >= 0) {
				writer.write(c); 
			}
		} finally {
			if (reader != null) {
				try {
					reader.close(); 
				} catch (IOException e) {}
				try {
					writer.close(); 
				} catch (IOException e) {}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		String sourceFile = "D:\\tmp\\source.txt"; 
		String targetFile = "D:\\tmp\\target.txt"; 
		copyCharacters(sourceFile, targetFile, null); 
	}
}
