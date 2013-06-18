package com.ibm.javacore.threading.async;

import java.util.Calendar;

public class AsyncInvoke {
	public static void delay(long ms) {
		System.out.println("begin method..."); 
		long start = Calendar.getInstance().getTimeInMillis(); 
		while (Calendar.getInstance().getTimeInMillis() < start + ms); 
		System.out.println("method end"); 
	}
	
	public static void main(String[] args) {
		System.out.println("method invoke here"); 
		new Thread("Async call demo") {
			public void run() {
				delay(2000); 
			}
		}.start(); 
		System.out.println("method invoked."); 
	}
}
