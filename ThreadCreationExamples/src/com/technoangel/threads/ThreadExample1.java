package com.technoangel.threads;

public class ThreadExample1 {

	public static void main(String[] args) {
		(new Thread(new HelloRunnable())).start();
		
		(new HelloThread()).start();
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Autodefined: " + Thread.currentThread().getName());
			}
		};
		
		Runnable r2 = () -> {
			System.out.println("Second Autodefined: " + Thread.currentThread().getName());
			System.out.println("I'm still here");
		};
		
		Thread t1 = new Thread(r1, "Thread Alpha");
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}