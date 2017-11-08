package com.technoangel.ninety9problems.lists;

import java.util.List;
import java.util.ArrayList;

public class PO14 {

	public static <R> List<R> duplicate(List<R> list) {
		List<R> results = new ArrayList<R>(list);
		int index = 1;
		
		for(R element : list) {
			results.add(index, element);
			index += 2;
		}
		
		return results;
	}
}
