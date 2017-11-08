package com.technoangel.examples;

import java.util.*;

public class MyScan {
	public static void main(String[] args) {
		String in = "1 a 10 . 100 1000";
		// This line will fix the error below
		// String in = "1 2 10 11 100 1000";
		Scanner s = new Scanner(in);
		int accum = 0;
		for (int x = 0; x < 4; x++) {
			// This line fails because of an InputMismatchException
			// Since it's reading for an integer but seeing strings at some point
			accum += s.nextInt();
		}
		System.out.println(accum);
	}
}
