package com.technoangel.threads;

public class ExampleSyncOne {

	public static double a = 10.0;
	public static double b;
	
	public static void main(String[] args) {
		Runnable r1 = () -> {
			if(a == 10) {
				try {
					Thread.sleep(500);
					b = a / 2.0;
					System.out.println(Thread.currentThread().getName() + ": " + b);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable r2 = () -> {
			a = 12;
		};
		
		Thread t1 = new Thread(r1, "Thread Alpha");
		Thread t2 = new Thread(r2, "Thread Bravo");
		
		t1.start();
		t2.start();
	}

}
