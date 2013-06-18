/*
 * Created on 2004/12/28
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.javaresearch;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * To research which path the ClassLoader.getResourceAsStream() based on. 
 * @author Wang_Yuan
 * 
 */
public class ClassLoaderPath {
	// Result: it is based on classpath. 
	private static final String RES_FILE = "org/javaresearch/res/resource.test"; 
	public static void main(String[] arg) throws IOException {
		// And we find that "/" cannot be identified here. url below will be null. 
		URL url = ClassLoaderPath.class.getClassLoader().getResource("/");
		if (url == null) {
			System.err.println("No resource can be find."); 
		}
		else {
			System.out.println("URL is " + url.toString()); 
		}
		InputStream in = ClassLoaderPath.class.getClassLoader().getResourceAsStream(RES_FILE);
		if (in == null) {
			System.err.println("Cannot get resource file."); 
			return; 
		}
		byte[] buffer = new byte[4096];
		int n = 0; 
		StringBuffer resContent = new StringBuffer(); 
		while ((n = in.read(buffer)) > 0) {
			resContent.append(new String(buffer, 0, n)); 
		}
		
		System.out.println(resContent.toString()); 
	}
}
