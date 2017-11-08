package com.technoangel.examples;

import java.io.Closeable;
import java.io.IOException;

class MyResource1 implements Closeable {
	public void close() {
		System.out.print("r1 ");
	}
}

class MyResource2 implements AutoCloseable {
	public void close() throws IOException {
		System.out.print("r2 ");
		throw new IOException();
	}
}

public class ClosableExample {
	public static void main(String[] args) {
		// The close() methods for each resource are called in the opposite order
		// when the block after the try is done executing
		try (MyResource1 r1 = new MyResource1(); 
				MyResource2 r2 = new MyResource2();) {
			System.out.print("try ");
		} catch (Exception e) {
			System.out.print("catch ");
			for (Throwable t : e.getSuppressed()) {
				System.out.println(t.getClass().getName());
			}
		}
	}
}
