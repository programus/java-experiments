/*
 * FileClassLoader.java
 * 
 * Created on 2004/07/30 0:01:07
 */
package org.javaresearch.loadclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * A class to load class from class-file. 
 * @author Programus
 */
public class FileClassLoader extends ClassLoader {
	
	private static FileClassLoader loader = null; 
	
	private FileClassLoader() {
		super(); 
	}
	
	/**
	 * Get a instance of this class loader. 
	 * @return a instance of this class loader. 
	 */
	public static synchronized FileClassLoader getInstance() {
		if (FileClassLoader.loader == null) {
			FileClassLoader.loader = new FileClassLoader(); 
		}
		return FileClassLoader.loader; 
	}
	
	/**
	 * Converts an array of bytes into an instance of class <code>Class</code>. 
	 * @param name Class Name
	 * @param b byte array
	 * @return The Class object that was created from the specified class data. 
	 */
	public Class defineClass(String name, byte[] b) {
		return super.defineClass(name, b, 0, b.length); 
	}
	
	/**
	 * Converts a class-file into an instance of class <code>Class</code>. 
	 * @param name Class Name
	 * @param fileName class-file name
	 * @return The Class object that was created from the specified class data. 
	 */
	public Class defineClass(String name, String fileName) throws IOException {
		File file = new File(fileName);
		FileInputStream in = new FileInputStream(file); 
		byte[] b = new byte[(int) file.length()]; 
		in.read(b); 
		return super.defineClass(name, b, 0, b.length); 
	}
	
	/**
	 * Converts a class-file into an instance of class <code>Class</code>. 
	 * @param fileName class-file name
	 * @return The Class object that was created from the specified class data. 
	 */
	public Class defineClass(String fileName) throws IOException {
		File file = new File(fileName);
		return this.defineClass(file); 
	}
	/**
	 * Converts a class-file into an instance of class <code>Class</code>. 
	 * @param file class-file 
	 * @return The Class object that was created from the specified class data. 
	 */
	public Class defineClass(File file) throws IOException {		
		FileInputStream in = new FileInputStream(file); 
		byte[] b = new byte[(int) file.length()]; 
		in.read(b); 
		return super.defineClass(b, 0, b.length); 
	}
}
