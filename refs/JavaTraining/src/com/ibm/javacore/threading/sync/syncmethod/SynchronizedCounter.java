package com.ibm.javacore.threading.sync.syncmethod;

public class SynchronizedCounter {
	private long c = 0; 
	
	public synchronized void increment() {
		System.out.print("Increment: from " + c); 
		c++; 
		System.out.println(" to " + c); 
	}
	
	public synchronized void decrement() {
		System.out.print("DECREMENT: FROM " + c); 
		c--; 
		System.out.println(" TO " + c); 
	}
	
	public synchronized long getValue() {
		return c; 
	}
	
	public static void main(String[] args) throws InterruptedException {
		final SynchronizedCounter counter = new SynchronizedCounter(); 
		
		Thread a = new Thread("Thread-A") {
			public void run() {
				while(!Thread.interrupted()) {
					counter.increment(); 
				}
			}
		}; 
		
		Thread b = new Thread("Thread-B") {
			public void run() {
				while(!Thread.interrupted()) {
					counter.decrement(); 
				}
			}
		}; 
		
		System.out.println(">>> Start <<<"); 
		a.start(); 
		b.start(); 
		
		Thread.sleep(30); 
		
		a.interrupt(); 
		b.interrupt(); 
		System.out.println(">>> Finish <<<"); 
	}
}
