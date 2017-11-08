package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class PO12Test {

	@Test
	public void shouldDecodeEncodedList() throws Exception {
	    List<String> encoded = PO12.decode(
	            Arrays.asList(
	                    new SimpleEntry<>(4, "a"),
	                    "b",
	                    new SimpleEntry<>(2, "c"),
	                    new SimpleEntry<>(2, "a"),
	                    "d",
	                    new SimpleEntry<>(4, "e")));

	    assertThat(encoded, hasSize(14));
	}

}
