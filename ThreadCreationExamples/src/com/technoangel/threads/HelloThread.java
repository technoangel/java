package com.technoangel.threads;

public class HelloThread extends Thread {
	@Override
	public void run() {
		System.out.println("I'm also here: " + Thread.currentThread().getName());
	}
}
