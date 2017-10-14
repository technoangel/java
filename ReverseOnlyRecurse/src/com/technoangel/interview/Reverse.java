package com.technoangel.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class Reverse {

	public String word;
	
	/**
	 * Generate the reverse of a given string
	 * @param testString the string to be reversed
	 * @return The reversed string
	 */
	public String showReverse(String testString) {
		
		// Grab the first character of the string
		String firstChar = testString.substring(0, 1);
		
		// Prepare to calculate the remaining reversed part of the string
		String remaining = "";
		
		// Find the reverse of the remaining parts of the String
		if (testString.length() > 1) {
			remaining = showReverse(testString.substring(1));
		}
		
		// Invert the order of the rest of the string and the first character
		return remaining + firstChar;
	}
	
	@Test
	public void testRecursion() {
		String testString = "Shimmering Gold and Silver";
		Reverse r = new Reverse();
		assertEquals(r.showReverse(testString), "revliS dna dloG gniremmihS");
	}
	
	public static void main(String[] args) {
		String name = "This sentence is forward";
		Reverse r = new Reverse();
		System.out.println("The reverse of '" + name + "' is '" + r.showReverse(name) + "'");
	}

}
