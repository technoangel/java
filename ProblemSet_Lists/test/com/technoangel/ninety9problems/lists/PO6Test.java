package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

import com.technoangel.ninety9problems.lists.PO6;

public class PO6Test {

	@Test
	public void testReturnTrueWhenPalindrome() throws Exception {
		assertTrue(PO6.isPalindrome(Arrays.asList("x", "a", "m", "a", "x")));
	}

	@Test
	public void testReturnFalseWhenNotPalindrome() throws Exception {
		assertFalse(PO6.isPalindrome(Arrays.asList(1, 2, 3, 4,5)));
	}
}