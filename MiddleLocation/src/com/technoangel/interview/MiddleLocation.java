package com.technoangel.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiddleLocation {
	
	public static Integer orderSum(List<Integer> numbers, Integer start, Integer stop) {
		Integer sum = 0;
		for (int i = start; i < stop; i++) {
			sum += numbers.get(i);
		}
		return sum;
	}
	
	public static Integer precSum(List<Integer> numbers, Integer index) {
		return orderSum(numbers, 0, index);
	}
	
	public static Integer succSum(List<Integer> numbers, Integer index) {
		return orderSum(numbers, index, numbers.size());
	}
	
	public static Integer findMiddle(List<Integer> numbers) {
		Integer index;
		for(index = 0; index < numbers.size(); index++) {
			Integer prec = precSum(numbers, index);
			Integer succ = succSum(numbers, index);
			
			if (prec < succ) { continue; }
			else if (prec == succ) {
				System.out.println("Middle at index: " + index);
				break;
			} else {
				Integer oldPrec = precSum(numbers, index - 1);
				Integer oldSucc = succSum(numbers, index - 1);
				System.out.println("No answer because:");
				System.out.println(oldPrec + " is smaller than " + oldSucc + " for index " + (index-1));
				System.out.println(prec + " is larger than " + succ + " for index " + index);
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
//		for(int i = 1; i < 30; i++) {
//			numbers.add(i);
//		}
		List<Integer> num = new ArrayList<Integer>(Arrays.asList(2, 4, 4, 5, 4, 1));
		System.out.println(MiddleLocation.findMiddle(num));
	}

}
