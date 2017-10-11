package com.technoangel.threads;

public class ThreadTester extends Thread {
	public ThreadTester(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i = 1; i < 6; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("..."+ i + "  [" + Thread.currentThread().getName() + "]");
		}
	}
}