package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.technoangel.ninety9problems.lists.PO4Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class PO4Test {

	@Test
	public void testLengthOfEmptyListShouldBeZero() throws Exception {
		int length = PO4.length(Collections.emptyList());
		assertThat(length, is(equalTo(0)));
	}
	
	@Test
	public void testLengthOfNonEmptyList() throws Exception {
		assertThat(PO4.length(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5)));
	}

}
