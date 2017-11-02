package com.technoangel.ninety9problems.lists;

import java.util.List;

public class PO6 {

	public static <T> boolean isPalindrome(List<T> elements) {
		boolean flag = true;
		int backNine;
		int midway = elements.size() / 2;
		
		for(int offset = 0; offset < midway; offset++) {
			backNine = elements.size() - offset - 1;
			if(!elements.get(offset).equals(elements.get(backNine))) {
				flag = false;
			}
		}
		return flag;
	}
}
