package com.ibm.javacore.threading.prodcons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		List queue = Collections.synchronizedList(new ArrayList(7)); 
		Thread prodThread = new Thread(new Producer(queue), "Producer"); 
		prodThread.start(); 
		long start = new Date().getTime(); 
		Thread[] conThreads = new Thread[3]; 
		for (int i = 0; i < conThreads.length; i++) {
			conThreads[i] = new Thread(new Consumer(queue), "Consumer - " + i); 
			conThreads[i].start(); 
		}
		while(prodThread.isAlive() || !queue.isEmpty()) {
			Thread.sleep(1000); 
		}
		for (int i = 0; i < conThreads.length; i++) {
			conThreads[i].interrupt(); 
		}
		System.out.println("Time used: " + (new Date().getTime() - start)); 
	}
}
