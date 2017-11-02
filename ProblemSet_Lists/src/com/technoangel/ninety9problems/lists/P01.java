package com.technoangel.ninety9problems.lists;

import java.util.LinkedList;
import java.util.List;

public class P01 {

	public static <T> T last(List<T> elements) {
		return elements.get(elements.size() - 1);
	}
	
	public static <T> T last(LinkedList<T> elements) {
		return elements.getLast();
	}
	
	public static <T> T lastRecursive(List<T> elements) throws IllegalArgumentException {
		if(elements.isEmpty()) {
			throw new IllegalArgumentException();
		} else if (elements.size() == 1) {
			return elements.get(0);
		} else {
			return lastRecursive(elements.subList(1, elements.size()));
		}
	}
}
