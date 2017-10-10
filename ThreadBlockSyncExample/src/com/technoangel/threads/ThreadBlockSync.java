package com.technoangel.threads;

public class ThreadBlockSync {

	public static void main(String[] args) {
		Countdown cd = new Countdown();
		Runnable r = () -> {
			synchronized(cd) {
				cd.printCount();
			}
		};
		
		Thread t1 = new Thread(r, "Thread Alpha");
		Thread t2 = new Thread(r, "Thread Beta");
		
		t1.start();
		t2.start();
	}

}
