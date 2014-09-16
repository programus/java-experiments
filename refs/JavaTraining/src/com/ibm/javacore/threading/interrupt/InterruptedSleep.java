package com.ibm.javacore.threading.interrupt;

public class InterruptedSleep implements Runnable {

	public void run() {
		while(true) {
			try {
				Thread.sleep(10000);
			}
			catch (InterruptedException e) {
				System.out.println("Thread interrupted in sleep. "); 
				break; 
			} 
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new InterruptedSleep()); 
		t.start(); 
		Thread.sleep(200); 
		while (t.isAlive()) {
			t.interrupt(); 
		}
	}

}
