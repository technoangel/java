package com.technoangel.ninety9problems.lists;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

public class PO12 {

	public static List<String> decode(List<Serializable> list) {
		System.out.println(list);
		List<String> results = new ArrayList<String>();
		
		for(Object data : list) {
			if (data instanceof SimpleEntry) {
				Integer sizeKey = (Integer)((SimpleEntry) data).getKey();
				String contents = (String)((SimpleEntry) data).getValue();
				for(int i = 0; i < sizeKey; i++) {
					results.add(contents);
				}
			} else {
				results.add((String) data);
			}
		}
		System.out.println(results);
		return results;
	}
}
