package com.technoangel.examples;

abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
}

public class Programmer extends Writer {
	public static void write() {
		System.out.println("Writing code");
	}

	public static void main(String[] args) {
		Writer w = new Programmer();
		// I don't know how this is calling the static method
		// but this runs.  Class static methods cannot be overridden
		// because overriding is only possible for object instances, not classes.
		w.write();
	}
}
