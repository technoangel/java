package com.technoangel.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTester {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("I'm thread " + i);
			es.execute(worker);
		}
		es.shutdown();
		while(!es.isTerminated()) { }
		
		System.out.println("Executor closed");
	}

}
