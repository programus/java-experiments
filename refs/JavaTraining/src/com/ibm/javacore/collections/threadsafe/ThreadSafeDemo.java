package com.ibm.javacore.collections.threadsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ThreadSafeDemo {
	public static int demo(final List list, final int testCount) throws InterruptedException {
		ThreadGroup group = new ThreadGroup(list.getClass().getName() + "@" + list.hashCode()); 
		final Random rand = new Random(); 
		
		Runnable listAppender = new Runnable() {
			public void run() {
				try {
					Thread.sleep(rand.nextInt(2));
				} catch (InterruptedException e) {
					return; 
				} 
				list.add("0"); 
			}
		}; 
		
		for (int i = 0; i < testCount; i++) {
			new Thread(group, listAppender, "InsertList-" + i).start(); 
		}
		
		while (group.activeCount() > 0) {
			Thread.sleep(10); 
		}
		
		return list.size(); 
	}
	public static void main(String[] args) throws InterruptedException {
		List unsafeList = new ArrayList(); 
		List safeList = Collections.synchronizedList(new ArrayList()); 
		final int N = 10000; 
		for (int i = 0; i < 10; i++) {
			unsafeList.clear(); 
			safeList.clear(); 
			int unsafeSize = demo(unsafeList, N); 
			int safeSize = demo(safeList, N); 
			System.out.println("unsafe/safe: " + unsafeSize + "/" + safeSize); 
		}
	}
}
