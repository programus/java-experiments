package com.ibm.javacore.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class CopyBytes {
	
	public static byte[] copyBytes(byte[] source) {
		ByteArrayInputStream in = new ByteArrayInputStream(source); 
		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
		try {
			int currentByte; 
			while ((currentByte = in.read()) >= 0) {
				out.write(currentByte); 
			}
		} finally {
			if (in != null) {
				try {
					in.close();
				}
				catch (IOException e) {} 
			}
			
			if (out != null) {
				try {
					out.close();
				}
				catch (IOException e) {} 
			}
		}
		
		return out.toByteArray(); 
	}
	
	public static void main(String[] args) {
		String hello = "Hello"; 
		byte[] source = hello.getBytes(); 
		byte[] target = copyBytes(source); 
		
		System.out.println(new String(target)); 
	}
}
