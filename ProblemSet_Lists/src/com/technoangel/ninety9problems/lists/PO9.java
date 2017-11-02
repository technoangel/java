package com.technoangel.ninety9problems.lists;

import java.util.ArrayList;
import java.util.List;

public class PO9 {
	public static <T> List<List<T>> pack(List<T> list) {
		List<List<T>> pList = new ArrayList<List<T>>();
		T a = null;
		List<T> subList = new ArrayList<T>();
		
		for(T obj : list) {
			if (!obj.equals(a)) {
				if (!subList.isEmpty()) {
					pList.add(new ArrayList<T>(subList));
					subList.clear();
				}
			}
			subList.add(obj);
			a = obj;
		}
		pList.add(subList);
		
		return pList;
	}
}
