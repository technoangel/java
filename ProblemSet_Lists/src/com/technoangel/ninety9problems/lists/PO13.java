package com.technoangel.ninety9problems.lists;

import java.util.List;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;

public class PO13 {
	
	public static <R> List<SimpleEntry<Integer, R>> encode_direct(List<R> list) {
		List<SimpleEntry<Integer, R>> results = new ArrayList<SimpleEntry<Integer, R>>();
		R lastEntry = null;
		Integer currentCount = 0;
		
		for(R entry : list) {
			if ((lastEntry == null) || (lastEntry.equals(entry))) {
				currentCount++;
			} else {
				results.add(new SimpleEntry<Integer, R>(currentCount, lastEntry));
				currentCount = 1;
			}
			lastEntry = entry;
		}
		
		results.add(new SimpleEntry<Integer, R>(currentCount, lastEntry));
		
		return results;
	}
}
