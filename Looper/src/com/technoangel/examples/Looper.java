package com.technoangel.examples;

public class Looper {
	public static void main(String[] args) {
		String[] sa = {"tom ", "jerry "};
		for (int x = 0; x < 3; x++) {
			for (String s : sa) {
				System.out.print(x + " " + s);
				if (x == 1) {
					break;
				}
			}
		}
	}
}