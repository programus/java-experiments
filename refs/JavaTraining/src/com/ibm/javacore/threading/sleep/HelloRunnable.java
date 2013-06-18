package com.ibm.javacore.threading.sleep;

import java.util.Calendar;

public class HelloRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.print("|"); 
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; 
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new HelloRunnable()); 
		t.start(); 
		System.out.println("Thread started. "); 
	}
}
