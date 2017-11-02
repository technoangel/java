package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.List;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

public class PO8Test {

	@Test
	public void testFlattenListOfLists() throws Exception {
		List<String> cList = PO8.compress(asList("a", "a", "a", "a", "b", "c", "c", "d", "e", "e", "e", "e"));
		assertThat(cList.size(), is(equalTo(5)));
		assertThat(cList, hasItems("a", "b", "c", "d", "e"));
	}
	
	@Test
	public void testNotFlattenNonListOfLists() throws Exception {
		List<String> cList = PO8.compress(asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
		assertThat(cList.size(), is(equalTo(6)));
		assertThat(cList, hasItems("a", "b", "c", "a", "d", "e"));
	}
}

