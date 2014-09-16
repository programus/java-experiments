package com.ibm.javacore.threading.interrupt;

public class IgnoreInterruption implements Runnable {

	public void run() {
		while (true) {
			System.out.println("Processing... DO NOT interrupt me!!"); 
			if (Thread.interrupted()) {
				System.err.println("This is interrupted: " + 
						Thread.currentThread().getName()); 
			}
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				System.err.println("Thread interrupted in sleep. "); 
			} 
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new IgnoreInterruption(), "NO INTERRUPT"); 
		t.start(); 
		Thread.sleep(302); 
		while (t.isAlive()) {
			t.interrupt(); 
		}
	}
}
