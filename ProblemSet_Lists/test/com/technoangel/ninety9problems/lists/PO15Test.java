package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;
import java.util.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class PO15Test {

	@Test
	public void shouldDuplicateElementsInAList() throws Exception {
	    List<String> duplicates = PO15.duplicate(Arrays.asList("a", "b", "c"), 3);
	    assertThat(duplicates, hasSize(9));
	    assertThat(duplicates, contains("a", "a", "a", "b", "b", "b", "c", "c", "c"));
	}

}
