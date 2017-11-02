package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import com.technoangel.ninety9problems.lists.P01;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class P01Test {

	@Test
	public void testShouldFindLastElementFromListOfLetters() throws Exception {
		assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
	}
	
	@Test
	public void testShouldFindLastElementFromLinkedListOfLetters() throws Exception {
		LinkedList<String> letters = new LinkedList<String>(asList("a", "b", "c", "d"));
		assertThat(P01.last(letters), is(equalTo("d")));
	}

	@Test
	public void testShouldFindLastElementUsingRecursion() throws Exception {
		assertThat(P01.lastRecursive(asList("a", "b", "c", "d")), is(equalTo("d")));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testShouldThrowIAEIfUsingRecursionOnEmptyArray() throws Exception {
		P01.lastRecursive(asList());
	}
}
