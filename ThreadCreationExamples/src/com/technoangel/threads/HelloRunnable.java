package com.technoangel.threads;

public class HelloRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("I'm here: " + Thread.currentThread().getName());
	}
}
