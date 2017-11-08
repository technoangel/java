package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

import org.junit.Test;

import static org.hamcrest.Matchers.*;

public class PO11Test {

	@Test
	public void shouldEncodeAList() throws Exception {
	    List<Object> encodedList = PO11.encode_modified(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
	    assertThat(encodedList, hasSize(6));
	    assertThat(encodedList.get(0), is(equalTo(new SimpleEntry<>(4, "a"))));
	    assertThat(encodedList.get(1), is(equalTo("b")));
	    assertThat(encodedList.get(2), is(equalTo(new SimpleEntry<>(2, "c"))));
	    assertThat(encodedList.get(3), is(equalTo(new SimpleEntry<>(2, "a"))));
	    assertThat(encodedList.get(4), is(equalTo("d")));
	    assertThat(encodedList.get(5), is(equalTo(new SimpleEntry<>(4, "e"))));
	}
}

