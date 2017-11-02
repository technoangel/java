package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class P02Test {
	
	@Test
	public void testShouldFindSecondLastElementFromAList() throws Exception {
		List<Integer> numbers = new LinkedList<Integer>(asList(1, 2, 11, 4, 5, 8, 10, 6));
		assertThat(P02.secondLast(numbers), is(equalTo(10)));
	}

	@Test(expected = NoSuchElementException.class)
	public void testShouldThrowExceptionWhenListEmpty() throws Exception {
		P02.secondLast(Collections.emptyList());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testShouldThrowExceptionWhenListNearEmpty() throws Exception {
		P02.secondLast(Arrays.asList(1));
	}

}
