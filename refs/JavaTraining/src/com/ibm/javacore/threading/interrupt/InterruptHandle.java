package com.ibm.javacore.threading.interrupt;

public class InterruptHandle implements Runnable {

	public void run() {
		while (true) {
			if (Thread.interrupted()) {
				System.out.println("This is interrupted: " + 
						Thread.currentThread().getName()); 
				break; 
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new InterruptHandle()); 
		t.start(); 
		Thread.sleep(100); 
		t.interrupt(); 
	}

}
