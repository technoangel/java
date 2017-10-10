package com.technoangel.threads;

public class ThreadSyncExample {

	public static int counter = 1;
	
	public static void main(String[] args) {
		Runnable r = () -> System.out.println(Thread.currentThread().getName() + ": " + getId());
		
		Thread t1 = new Thread(r, "Thread Alpha");
		Thread t2 = new Thread(r, "Thread Beta");
		
		t1.start();
		t2.start();
	}
	
	/**
	 * Synch locks the method so it cannot be called more than once at a time.
	 * Without synchronized, this causes the IDs to sometimes be 1 & 1
	 * @return
	 */
	public static synchronized int getId() {
		return (counter++);
	}

}
