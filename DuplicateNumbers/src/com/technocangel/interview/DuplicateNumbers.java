package com.technocangel.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateNumbers {
	
	public List<Integer> numbers;
	
	public DuplicateNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	public Map<Integer, Integer> buildStats(List<Integer> numbers) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int num:numbers) {
			if (!hm.containsKey(num)) {
				hm.put(num, new Integer(0));
			}
			Integer val = hm.get(num);
			hm.put(num, val+1);
		}
		return hm;
	}
	
	public List<Integer> scanDuplicates(Map<Integer, Integer> hm) {
		List<Integer> dups = new ArrayList<Integer>();
		for (Integer num:hm.keySet()) {
			if (hm.get(num) > 1) {
				dups.add(num);
			}
		}
		return dups;
	}
	
	public List<Integer> findDuplicates() {
		Map<Integer, Integer> hm = buildStats(numbers);
		return scanDuplicates(hm);
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i <= 30; i++) {
			numbers.add(i);
		}
		numbers.add(22);
		numbers.add(43);
		numbers.add(10);
		DuplicateNumbers dn = new DuplicateNumbers(numbers);
		System.out.println("Duplicate Numbers: " + dn.findDuplicates());

	}

}
