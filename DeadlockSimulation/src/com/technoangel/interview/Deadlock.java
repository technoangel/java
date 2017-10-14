package com.technoangel.interview;

public class Deadlock {

	public String resource1;
	public String resource2;

	public Runnable r1;
	public Runnable r2;
	public Thread t1;
	public Thread t2;

	public void printStatus(String resource1, String resource2) {
		System.out.println("Using both " + resource1 + " and " + resource2 + " :: " + Thread.currentThread().getName());
	}

	public void startRace() {
		this.t1.start();
		this.t2.start();
	}

	public Deadlock() {
		resource1 = "Resource 1";
		resource2 = "Resource 2";

		r1 = () -> {
			while (true) {
				synchronized (resource1) {
					synchronized (resource2) {
						printStatus(resource1, resource2);
					}
				}
			}
		};

		r2 = () -> {
			while (true) {
				synchronized (resource2) {
					synchronized (resource1) {
						printStatus(resource1, resource2);
					}
				}
			}
		};

		t1 = new Thread(r1, "Thread Alpha");
		t2 = new Thread(r2, "Thread Beta");
	}

	public static void main(String[] args) {
		Deadlock myDeadlock = new Deadlock();
		myDeadlock.startRace();
	}
}
