package com.technoangel.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class Reverse {

	public String word;
	
	public Reverse() {}
	
	public String showReverse(String testString) {
		String firstChar = testString.substring(0, 1);
		String remaining = "";
		
		if (testString.length() > 1) {
			remaining = showReverse(testString.substring(1));
		}
		
		return remaining + firstChar;
	}
	
	@Test
	public void testRecursion() {
		String testString = "Eric Alsheimer";
		Reverse r = new Reverse();
		assertEquals(r.showReverse(testString), "remiehslA cirE");
	}
	
	public static void main(String[] args) {
		String name = "Mark Mowers";
		Reverse r = new Reverse();
		System.out.println("The reverse of " + name + " is " + r.showReverse(name));
	}

}