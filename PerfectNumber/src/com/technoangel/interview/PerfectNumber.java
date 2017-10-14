package com.technoangel.interview;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PerfectNumber {

	/**
	 * Find the integer divisors for a number
	 * @param number Number to be evaluated
	 * @return list of integer divisors
	 */
	public List<Integer> findDivisors(Integer number) {
		List<Integer> divisors = new ArrayList<Integer>();
		for(int i = 1; i < (number / 2) + 1; i++) {
			if (number % i == 0) {
				divisors.add(i);
			}
		}
		return divisors;
	}
	
	/**
	 * Check if the sum of the divisors are equal to the principal number
	 * @param divisors List of integer divisors for a number
	 * @param number Principle number to check for being perfect
	 * @return
	 */
	public boolean checkPerfectSum(List<Integer> divisors, Integer number) {
		Integer sum = divisors.stream().reduce(0, (a, b) -> a + b);
		return number.equals(sum);
	}
	
	/**
	 * Determine if the number if perfect
	 * @param number The number in question
	 * @return TRUE: number is perfect.  FALSE: number is not perfect
	 */
	public boolean isPerfect(Integer number) {
		List<Integer> divisors = findDivisors(number);
		return checkPerfectSum(divisors, number);
	}
	
	/**
	 * Positive check that a perfect number can be identified
	 */
	@Test
	public void testIsPerfectNumber() {
		PerfectNumber pn = new PerfectNumber();
		assertEquals(pn.isPerfect(6), true);
	}
	
	/**
	 * Negative check that a non-perfect number will not be falsely identified
	 */
	@Test
	public void testIsNotPerfectNumber() {
		PerfectNumber pn = new PerfectNumber();
		assertEquals(pn.isPerfect(7), false);
	}
	
	// Executable.  8128 is a perfect number
	public static void main(String[] args) {
		PerfectNumber pn = new PerfectNumber();
		System.out.println("8128 is a perfect number: " + pn.isPerfect(8128));
	}

}
