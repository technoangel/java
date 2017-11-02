package com.technoangel.ninety9problems.lists;

import java.util.List;

public class PO4 {

	@SafeVarargs
	public static <T> Integer length(T...args) {
		if(args.length == 0) { return 0; }
		@SuppressWarnings("unchecked")
		List<T> elements = (List<T>)args[0];
		return elements.size();
	}
}
