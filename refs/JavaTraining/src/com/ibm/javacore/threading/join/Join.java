package com.ibm.javacore.threading.join;

public class Join {

	public static void main(String[] args) throws InterruptedException {
		// something need to be processed in parallel. 
		Thread t = new Thread(new Runnable() {
			public void run() {
				try {
					System.out.println("Processing sub task..."); 
					Thread.sleep(3000);
					System.out.println("Sub task was finished! "); 
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}); 
		
		t.start(); 
		System.out.println("Processing main task..."); 
		Thread.sleep(1000); 
		System.out.println("Main task was finished! "); 
		System.out.println("There are " + Thread.activeCount() + " active Threads"); 
		t.join(); 
		System.out.println("There are " + Thread.activeCount() + " active Threads"); 
		System.out.println("All finished! "); 
	}

}
