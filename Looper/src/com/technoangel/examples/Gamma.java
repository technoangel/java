package com.technoangel.examples;

class Alpha {
	String getType() {
		return "alpha";
	}
}

class Beta extends Alpha {
	String getType() {
		return "beta";
	}
}

public class Gamma extends Beta {
	String getType() {
		return "gamma";
	}

	public static void main(String[] args) {
		Alpha g1 = new Alpha();
		Beta g2 = new Beta();
		System.out.println(g1.getType() + " " + g2.getType());
	}
}
