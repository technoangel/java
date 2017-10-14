package com.technoangel.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiddleLocation {
	
	/**
	 * Sum array of numbers between two indices
	 * @param numbers array of numbers
	 * @param start index to start summing
	 * @param stop index to stop summing
	 * @return
	 */
	private static Integer orderSum(List<Integer> numbers, Integer start, Integer stop) {
		Integer sum = 0;
		for (int i = start; i < stop; i++) {
			sum += numbers.get(i);
		}
		return sum;
	}
	
	/**
	 * Sum all numbers in array from start to beginning of array
	 * @param numbers array of numbers
	 * @param index point to stop summing
	 * @return
	 */
	public static Integer precedingSum(List<Integer> numbers, Integer index) {
		return orderSum(numbers, 0, index);
	}
	
	/**
	 * Sum all numbers in array after index until end of array
	 * @param numbers array of numbers
	 * @param index starting position
	 * @return
	 */
	
	public static Integer succeedingSum(List<Integer> numbers, Integer index) {
		return orderSum(numbers, index, numbers.size());
	}
	
	/**
	 * Find the index where the sum on the left equals the sum on the right, and provide feedback either way.
	 * @param numbers The array of numbers that need to be processed
	 * @return The determined median of numbers
	 */
	public static void findMiddle(List<Integer> numbers) {
		Integer index;
		
		// Loop through the numbers
		for(index = 0; index < numbers.size(); index++) {
			// Determine preceding sum
			Integer sumPreceding = precedingSum(numbers, index);
			
			// Determine succeeding sum
			Integer sumSucceeding = succeedingSum(numbers, index);
			
			// If 
			if (sumPreceding < sumSucceeding) { continue; }
			else if (sumPreceding == sumSucceeding) {
				System.out.println("Middle is at index: " + index + ", both sides are " + sumPreceding);
				break;
			} else {
				Integer oldPreceding = precedingSum(numbers, index - 1);
				Integer oldSucceeding = succeedingSum(numbers, index - 1);
				System.out.println("No answer because:");
				System.out.println(oldPreceding + " is smaller than " + oldSucceeding + " for index " + (index-1));
				System.out.println(oldSucceeding + " is larger than " + sumSucceeding + " for index " + index);
				break;
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2, 4, 4, 5, 4, 1);
		System.out.println(num);
		MiddleLocation.findMiddle(num);
	}
}
