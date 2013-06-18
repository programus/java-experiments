package com.ibm.javacore.threading.prodcons;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Producer implements Runnable {
	private List queue;
	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS"); 

	public Producer(List queue) {
		this.queue = queue;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			synchronized (queue) {
				while(queue.size() >= 7) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						return; 
					} 
				}
				queue.add(Thread.currentThread().getName() + ": (" + i + ") " + this.sdf.format(new Date()));
				queue.notifyAll();
			}
		}
	}
}
