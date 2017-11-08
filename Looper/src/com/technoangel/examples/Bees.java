package com.technoangel.examples;

public class Bees {
	public static void main(String[] args) {
		try {
			new Bees().go();
		} catch (Exception e) {
			System.out.println("thrown to main");
		}
	}

	synchronized void go() throws InterruptedException {
		Thread t1 = new Thread();
		t1.start();
		System.out.print("1 ");
		// This wait causes an interrupt exception and I don't know why yet.
		//t1.wait(1000);
		System.out.print("2 ");
		// This wait also causes an issue, not sure why
		Thread.currentThread().wait(2000);
	}
}