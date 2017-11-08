package com.technoangel.examples;

public interface Interfaces {
	// This cannot compile because it is is an instance implementation
	// not designated as default or abstract
	public void method1() {
		System.out.println("method1");
	}
	
	// Good code, defaulted
	public default void method2() {
		System.out.println("method2");
	}

	// Good code, static
	public static void method3() {
		System.out.println("method3");
	}

	// Good code, abstract
	public abstract void method4();
}
