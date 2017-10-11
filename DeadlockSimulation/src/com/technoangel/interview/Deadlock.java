package com.technoangel.interview;

public class Deadlock {

	String str1 = "Java";
	String str2 = "Unix";
	
	Runnable r1 = () -> {
		while(true) {
			synchronized(str1) {
				synchronized(str2) {
					System.out.println(str1 + str2 + Thread.currentThread().getName());
				}
			}
		}
	};
	
	Runnable r2 = () -> {
		while(true) {
			synchronized(str1) {
				synchronized(str2) {
					System.out.println(str1 + str2 + Thread.currentThread().getName());
				}
			}
		}
	};
	
	Thread t1 = new Thread(r1, "Thread Alpha");
	Thread t2 = new Thread(r2, "Thread Beta");
	
	public static void main(String[] args) {
		Deadlock myDeadlock = new Deadlock();
		myDeadlock.t2.start();
		myDeadlock.t1.start();
	}
}