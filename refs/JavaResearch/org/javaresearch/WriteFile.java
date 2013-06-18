/*
 * Created on 2004/12/29
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.javaresearch;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * Research usage of OutputStreams and String -> byte[] with encode.
 * @author Wang_Yuan
 */
public class WriteFile {
	private static final String FNAME = "d:\\yezhen.txt";
	private static final String FCONTENT = "Ye Zhen\nWang Yuan\n‚±‚ñ‚É‚¿‚Í"; 
	public static void main(String[] args) throws Exception {
		FileOutputStream fo = new FileOutputStream(FNAME);
		BufferedOutputStream out = new BufferedOutputStream(fo); 
		byte[] content = FCONTENT.getBytes("GB2312"); 
		out.write(content);
		out.flush();
		fo.flush(); 
		out.close(); 
		fo.close(); 
		System.out.println("Completed!"); 
	}
}
