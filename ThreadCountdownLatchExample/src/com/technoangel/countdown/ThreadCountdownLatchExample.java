package com.technoangel.countdown;

import java.util.concurrent.CountDownLatch;

public class ThreadCountdownLatchExample {

	public static void main(String[] args) {
		CountDownLatch start = new CountDownLatch(1);
		CountDownLatch end = new CountDownLatch(4);
		
		for(int i = 0; i < 5; i++) {
			new Thread(new Worker(start, end)).start();
		}
		
		try{
			System.out.println("Main thread running");
			Thread.sleep(1000);
			start.countDown();
			System.out.println("Main thread doing something else");
			end.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Worker implements Runnable{
	public CountDownLatch start;
	public CountDownLatch end;
	
	public Worker(CountDownLatch start, CountDownLatch end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		try {
			printInfo("Thread running");
			start.await();
			printInfo("Doing work");
			Thread.sleep(3000);
			end.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void printInfo(String message) {
		System.out.println(message);
	}
}