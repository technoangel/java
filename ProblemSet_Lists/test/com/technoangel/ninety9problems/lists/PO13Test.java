package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;
import static org.hamcrest.Matchers.*;
import java.util.AbstractMap.SimpleEntry;

import org.junit.Test;

public class PO13Test {

	@Test
	public void shouldEncodeAList() throws Exception {
	    List<SimpleEntry<Integer, String>> encodedList = PO13.encode_direct(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
	    assertThat(encodedList, hasSize(6));
	    assertThat(encodedList.get(0), is(equalTo(new SimpleEntry<>(4, "a"))));
	    assertThat(encodedList.get(1), is(equalTo(new SimpleEntry<>(1, "b"))));
	    assertThat(encodedList.get(2), is(equalTo(new SimpleEntry<>(2, "c"))));
	    assertThat(encodedList.get(3), is(equalTo(new SimpleEntry<>(2, "a"))));
	    assertThat(encodedList.get(4), is(equalTo(new SimpleEntry<>(1, "d"))));
	    assertThat(encodedList.get(5), is(equalTo(new SimpleEntry<>(4, "e"))));
	}

}
