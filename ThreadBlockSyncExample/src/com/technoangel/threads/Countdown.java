package com.technoangel.threads;

public class Countdown {
	public void printCount() {
		try {
			for(int i = 10; i >= 1; i--) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread Interrupted");
		}
		System.out.println(Thread.currentThread().getName() + ": Blastoff");
	}
}
