/*
 * Created on 2005/02/08
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.javaresearch;

/**
 * Research the shut down hook of JVM. 
 * 
 * To test this class, you should run this in a command console and press [Ctrl+C]
 * to terminate the current virtual machine. 
 * 
 * If you close the console window to terminate current virtual machine, you will 
 * find a file created by WriteFile class.  
 * 
 */
public class ShutDownHook extends Thread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Shut down hook test class is running..."); 
		System.out.println("Press [Ctrl + C] to terminate it. "); 
		Runtime.getRuntime().addShutdownHook(new ShutDownHook()); 
		while(true) {
			Thread.sleep(100); 
		}
	}
	
	public void run() {
		System.out.println(); 
		System.out.println("The virtual machine has been shutted down."); 
		System.out.println("Test success!"); 
		try {
			WriteFile.main(null);
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
