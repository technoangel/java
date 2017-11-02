package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.technoangel.ninety9problems.lists.PO3;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class PO3Test {

	@Test
	public void testShouldFindKthElementFromList() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		assertThat(PO3.kth(numbers, 2), is(equalTo(3)));
	}

}
