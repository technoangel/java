package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class PO7Test {

//	@Test
//	public void testFlattenListOfLists() throws Exception {
//		List<String> flatten = PO7.flatten(asList("a", asList("b", asList("c", "d")), "e"), String.class);
//		assertThat(flatten.size(), is(equalTo(5)));
//		assertThat(flatten, hasItems("a", "b", "c", "d", "e"));
//	}
//
//	@Test
//	public void testFlattenDeepNestedLists() throws Exception {
//		List<String> flatten = PO7.flatten(asList("a", asList("b", asList("c", asList("d", "e", asList("f", "g"))), "h")), String.class);
//		assertThat(flatten.size(), is(equalTo(8)));
//		assertThat(flatten, hasItems("a", "b", "c", "d", "e", "f", "g", "h"));
//	}
//	
//	@Test
//	public void testReturnEmptyListWhenFlatteningEmptyList() throws Exception {
//		List<String> flatten = PO7.flatten(Collections.emptyList(), String.class);
//		assertTrue(flatten.isEmpty());
//	}
}
