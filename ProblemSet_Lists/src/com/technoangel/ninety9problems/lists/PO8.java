package com.technoangel.ninety9problems.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PO8 {
	
	public static <T> List<T> compress(List<T> list) {
		List<T> cList = new ArrayList<T>(list);
		T cBaseElem = null;
		for(Iterator<T> iter = cList.listIterator(); iter.hasNext();) {
			T a = iter.next();
		    if (!a.equals(cBaseElem)) {
		    	cBaseElem = a;
		    } else {
		    	iter.remove();
		    }
		}
		
		return cList;
	}

}
