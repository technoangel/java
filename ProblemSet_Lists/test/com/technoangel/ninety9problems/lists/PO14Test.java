package com.technoangel.ninety9problems.lists;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import java.util.*;

import org.junit.Test;

public class PO14Test {

	@Test
	public void shouldDuplicateElementsInAList() throws Exception {
	    List<String> duplicates = PO14.duplicate(Arrays.asList("a", "b", "c", "d"));
	    assertThat(duplicates, hasSize(8));
	    assertThat(duplicates, contains("a", "a", "b", "b", "c", "c", "d", "d"));
	}

}
