package com.technoangel.ninety9problems.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

public class PO11 {

	public static <R> List<Object> encode_modified(List<R> list) {
		// build compressed list
		List<List<R>> pList = PO9.pack(list);
		
		// Begin a result array
		List<Object> results = new ArrayList<Object>();
		
		// For each element in the packed list
		for(List<R> occurances : pList) {
			// Store that key/value as a SimpleEntry and store that entry in the result array
			Integer size = new Integer(occurances.size());
			R value = (R) occurances.get(0);
			Object stats = (size == 1) ? value : new SimpleEntry<Integer, R>(size, value);
			results.add(stats);
		}
		
		// Return the result array
		return results;
	}
}

