package com.technoangel.threads;

public class ThreadJoinTest {

	public static void main(String[] args) {
		Thread t1 = new ThreadTester("Thread Single");
		Thread t2 = new ThreadTester("Thread Double");
		Thread t3 = new ThreadTester("Thread Triple");
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
	}

}
