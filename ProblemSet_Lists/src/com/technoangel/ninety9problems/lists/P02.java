package com.technoangel.ninety9problems.lists;

import java.util.List;

public class P02 {
	public static <T> T secondLast(List<T> elements) throws NoSuchElementException {
		if(elements.size() < 2) {
			throw new NoSuchElementException();
		}
		return elements.get(elements.size() - 2);
	}
}

class NoSuchElementException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4792860883927791057L;
	
}