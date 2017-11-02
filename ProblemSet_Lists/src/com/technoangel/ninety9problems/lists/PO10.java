package com.technoangel.ninety9problems.lists;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.ArrayList;

import com.technoangel.ninety9problems.lists.PO9;

public class PO10 {

	public static <R> List<SimpleEntry<Integer, R>> encode(List<R> list) {
		// build compressed list
		List<List<R>> pList = PO9.pack(list);
		
		// Begin a result array
		List<SimpleEntry<Integer, R>> results = new ArrayList<SimpleEntry<Integer, R>>();
		
		// For each element in the packed list
		for(List<R> occurances : pList) {
			// Store that key/value as a SimpleEntry and store that entry in the result array
			Integer size = new Integer(occurances.size());
			R value = (R) occurances.get(0);
			SimpleEntry<Integer, R> stats = new SimpleEntry<Integer, R>(size, value);
			results.add(stats);
		}
		
		// Return the result array
		return results;
	}
}
