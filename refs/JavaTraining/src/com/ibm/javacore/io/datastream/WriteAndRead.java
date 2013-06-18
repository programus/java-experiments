package com.ibm.javacore.io.datastream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class WriteAndRead {
	public static byte[] writeToBytes() throws IOException {
		ByteArrayOutputStream stream = new ByteArrayOutputStream(); 
		DataOutputStream out = new DataOutputStream(stream); 
		int i = 3; 
		double pi = 3.14159265; 
		String hello = "Hello"; 
		
		try {
			out.writeInt(i); 
			out.writeDouble(pi); 
			out.writeUTF(hello);
		}
		finally {
			if (out != null) {
				out.close(); 
			}
		}
		
		return stream.toByteArray(); 
	}
	
	public static void readFromBytes(byte[] data) throws IOException {
		DataInputStream in = new DataInputStream(new ByteArrayInputStream(data)); 
		int i;
		double pi;
		String hello;
		try {
			i = in.readInt(); 
			pi = in.readDouble(); 
			hello = in.readUTF();
		}finally {
			in.close(); 
		} 
		
		System.out.println("i = " + i + ", pi = " + pi + ", hello = " + hello); 
	}
	
	public static void main(String[] args) throws IOException {
		byte[] data = writeToBytes(); 
		for (int i = 0; i < data.length; i++) {
			System.out.print(hexByte(data[i])); 
		}
		System.out.println(); 
		readFromBytes(data); 
	}
	
	public static String hexByte(byte b) {
		StringBuffer buff = new StringBuffer(Integer.toHexString(b)); 
		if (buff.length() < 2) {
			buff.insert(0, '0'); 
		} else if (buff.length() > 2) {
			buff.delete(0, buff.length() - 2); 
		}
		
		return buff.toString(); 
	}
}
