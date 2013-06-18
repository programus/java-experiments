/*
 * Created on 2005/02/21
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.javaresearch;

import java.util.Calendar;

/**
 * Manage to understand the join() function of class Thread. 
 * @author Wang_Yuan
 */
public class ThreadJoin {
	
	protected static boolean runnable = true; 
	
	public static void main(String[] args) throws InterruptedException {
		Thread testThread = new Thread("Test Thread") {
			public void run() {
				Calendar calendar = Calendar.getInstance(); 
				int i = 0; 
				while (runnable) {
					System.out.println("In thread: " + i++ + calendar.getTime() + calendar.getTimeInMillis()); 
					try {
						Thread.sleep(100);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		}; 
		
		System.out.println("Start the thread. " + Calendar.getInstance().getTime() + Calendar.getInstance().getTimeInMillis()); 
		testThread.start(); 
		
		System.out.println("Join the thread. " + Calendar.getInstance().getTime() + Calendar.getInstance().getTimeInMillis()); 
		testThread.join(3000); 

		System.out.println("The thread is start." + Calendar.getInstance().getTime() + Calendar.getInstance().getTimeInMillis());
		runnable = false; 
	}
}
