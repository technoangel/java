package com.technoangel.ninety9problems.lists;

import java.util.ArrayList;
import java.util.List;

public class PO15 {

	public static <R> List<R> duplicate(List<R> list, Integer times) {
		List<R> results = new ArrayList<R>(list);
		int index = 1;
		
		for(R element : list) {
			for(int i = 1; i < times; i++) { results.add(index, element); }
			index += times;
		}
		
		return results;
	}
}
