package com.ibm.javacore.threading.deadlock;

public class Deadlock {
	static class Friend {
		private final String name;

		public Friend(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public synchronized void bow(Friend bower) {
			System.out.println(this.name + ":" + bower.getName() + " has bowed to me!");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			bower.bowBack(this);
		}

		public synchronized void bowBack(Friend bower) {
			System.out.println(this.name + ":" + bower.getName() + " has bowed back to me!");
		}
	}

	public static void main(String[] args) {
		final Friend tom = new Friend("Tom");
		final Friend jerry = new Friend("Jerry");
		new Thread(new Runnable() {
			public void run() {
				tom.bow(jerry);
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				jerry.bow(tom);
			}
		}).start();
	}
}
