package com.technoangel.executor;

public class WorkerThread implements Runnable {

	public String message;
	
	public WorkerThread(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		System.out.println(message + ": (starting);");
		workToBeDone();
		System.out.println(message + ": (end);");
	}

	private void workToBeDone() {
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
