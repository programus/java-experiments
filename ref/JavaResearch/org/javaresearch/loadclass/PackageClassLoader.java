/*
 * Created on 2005/02/22
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.javaresearch.loadclass;

import java.net.URL;

/**
 * @author Wang_Yuan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PackageClassLoader extends ClassLoader {
	
	public PackageClassLoader() {
		super(); 
	}
	
	public PackageClassLoader(ClassLoader parent) {
		super(parent); 
	}
	
	public static void main(String[] args) {
	}
	/* (non-Javadoc)
	 * @see java.lang.ClassLoader#definePackage(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.net.URL)
	 */
	public Package definePackage(String name, String specTitle,
			String specVersion, String specVendor, String implTitle,
			String implVersion, String implVendor, URL sealBase)
			throws IllegalArgumentException {
		return super.definePackage(name, specTitle, specVersion, specVendor,
				implTitle, implVersion, implVendor, sealBase);
	}
	/* (non-Javadoc)
	 * @see java.lang.ClassLoader#findClass(java.lang.String)
	 */
	public Class findClass(String name) throws ClassNotFoundException {
		return super.findClass(name);
	}
}
