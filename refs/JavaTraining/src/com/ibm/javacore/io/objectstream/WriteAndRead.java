package com.ibm.javacore.io.objectstream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteAndRead {

	public static byte[] writeToBytes() throws IOException {
		ByteArrayOutputStream stream = new ByteArrayOutputStream(); 
		ObjectOutputStream out = new ObjectOutputStream(stream); 
		
		TestObject o = new TestObject(); 
		o.i = 3; 
		o.d = 3.14159; 
		o.str = "hello"; 
		
		try {
			out.writeObject(o); 
		}
		finally {
			if (out != null) {
				out.close(); 
			}
		}
		
		return stream.toByteArray(); 
	}
	
	public static void readFromBytes(byte[] data) throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data)); 
		Object o; 
		try {
			o = in.readObject(); 
		}finally {
			in.close(); 
		} 
		
		System.out.println(o); 
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		byte[] data = writeToBytes(); 
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

class TestObject implements Serializable {
	int i; 
	double d; 
	String str; 
	public String toString() {
		return "i = " + i + ", d = " + d + ", str = " + str; 
	}
}
