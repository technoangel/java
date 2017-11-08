package com.technoangel.examples;

interface Rideable { 
	// This is public since it's in an interface.
	// Interfaces are public-facing contracts.
	String getGait(); 
}

public class Camel implements Rideable {
	int weight = 2;
	
	// The interface's access modifier is public
	// The non-access modifier of a class is 'package', which is not
	// in-line with the interfaces' declaration
	String getGait() { 
		return " mph, lope"; 
	}
	
	void go(int speed) {
		++speed; weight++;
		int walkrate = speed * weight;
		System.out.print(walkrate + getGait());
	}
	
	public static void main(String[] args) {
		new Camel().go(8);
	}
}
