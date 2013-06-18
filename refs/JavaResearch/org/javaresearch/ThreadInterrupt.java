/*
 * Created on 2005/02/21
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.javaresearch;

/**
 * Try to know how to use interrupt() function instead of stop() function. 
 * @author Wang_Yuan
 */
public class ThreadInterrupt {

	public static void main(String[] args) {
		Thread testThread = new Thread("Test Thread") {
			public void run() {
				for(int i = 0; true; i++) {
					System.out.println(i); 
				}
			}
		}; 
		
		System.out.println("Start thread. "); 
		testThread.start(); 
		System.out.println("Thread is started. "); 
		testThread.interrupt(); 
		System.out.println("Thread is interruptted! " + testThread.isInterrupted()); 
	}
}
