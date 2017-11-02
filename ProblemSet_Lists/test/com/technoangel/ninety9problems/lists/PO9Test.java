package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;

public class PO9Test {

	@Test
	public void shouldReturnAListWithTwoListElementsWhenAListWithTwoUniqueElementsIsPassed() throws Exception {
	    List<List<String>> packedList = PO9.pack(Arrays.asList("a", "b"));
	    assertThat(packedList, hasSize(2));
	    assertThat(packedList.get(0), contains("a"));
	    assertThat(packedList.get(1), contains("b"));
	}

	@Test
	public void shouldPackConsecutiveDuplicatesInTheirOwnLists() throws Exception {
	    List<List<String>> packedList = PO9.pack(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
	    assertThat(packedList, hasSize(6));
	    assertThat(packedList.get(0), contains("a", "a", "a", "a"));
	    assertThat(packedList.get(1), contains("b"));
	    assertThat(packedList.get(2), contains("c", "c"));
	    assertThat(packedList.get(3), contains("a", "a"));
	    assertThat(packedList.get(4), contains("d"));
	    assertThat(packedList.get(5), contains("e", "e", "e", "e"));
	}

}
