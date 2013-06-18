package com.ibm.javacore.threading.async;

import java.util.Calendar;

public class SyncInvoke {
	public static void delay(long ms) {
		System.out.println("begin method..."); 
		long start = Calendar.getInstance().getTimeInMillis(); 
		while (Calendar.getInstance().getTimeInMillis() < start + ms); 
		System.out.println("method end"); 
	}
	
	public static void main(String[] args) {
		System.out.println("method invoke here"); 
		delay(2000); 
		System.out.println("method invoked."); 
	}
}
