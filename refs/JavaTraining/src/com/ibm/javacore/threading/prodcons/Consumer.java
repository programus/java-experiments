package com.ibm.javacore.threading.prodcons;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Consumer implements Runnable {
	private List queue; 
	private static Random rand = new Random(); 
	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS"); 
	
	public Consumer(List queue) {
		this.queue = queue; 
	}

	public void run() {
		while(!Thread.interrupted()) {
			String item; 
			synchronized(queue) {
				while(queue.isEmpty()) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						return; 
					} 
				}
				item = (String) this.queue.remove(0); 
				queue.notifyAll(); 
			}
			synchronized(Consumer.class) {
				System.out.print(Thread.currentThread().getName() + 
						" processing[" + this.sdf.format(new Date())); 
				System.out.println("] - " + item); 
			}
			try {
				int sleepTime; 
				synchronized(rand) {
					sleepTime = rand.nextInt(5000); 
				}
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				break; 
			} 
		}
	}
}
