package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.technoangel.ninety9problems.lists.PO5Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class PO5Test {

	@Test
	public void testReverseList() throws Exception {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		assertThat(PO5.reverse(numbers), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
	}
	
	@Test
	public void testLengthOfNonEmptyList() throws Exception {
		assertThat(PO4.length(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5)));
	}

}