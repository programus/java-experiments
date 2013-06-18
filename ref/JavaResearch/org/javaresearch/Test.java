package org.javaresearch;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable {
	private int i; 
	private transient InputStream c; 
	
	public static void main(String[] args) throws Exception {
		byte[] buff = "ABC".getBytes();  
		ByteArrayInputStream bai = new ByteArrayInputStream(buff); 
		ByteArrayOutputStream bao = new ByteArrayOutputStream(); 
		ObjectOutputStream bos = new ObjectOutputStream(bao); 
		Test t = new Test(); 
		t.i = 3; 
		t.c = bai; 
		bos.writeObject(t); 
		bos.flush(); 
		byte[] data = bao.toByteArray();
		for (byte d : data) {
			System.out.println(d); 
		}
	}
}
