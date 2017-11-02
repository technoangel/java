package com.technoangel.ninety9problems.lists;

import java.util.ArrayList;
import java.util.List;

public class PO5 {
	
	public static <T> List<T> reverse(List<T> elements) throws IllegalArgumentException{
		List<T> result = new ArrayList<T>();
		for(T element : elements) { result.add(0, element); }
		return result;
	}
}
