package com.technoangel.interview;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class PerfectNumber {

	public List<Integer> findDivisors(Integer number) {
		List<Integer> divisors = new ArrayList<Integer>();
		for(int i = 1; i <= number; i++) {
			if (number % i == 0) {
				divisors.add(i);
			}
		}
		return divisors;
	}
	
	public boolean perfectSum(List<Integer> divisors, Integer number) {
		Integer sum = 0;
		for(int divisor:divisors) {
			sum += divisor;
		}
		return (number * 2) == sum;
	}
	
	
	public boolean isPerfect(Integer number) {
		List<Integer> divisors = findDivisors(number);
		return perfectSum(divisors, number);
	}
	
	@Test
	public void testIsPerfectNumber() {
		PerfectNumber pn = new PerfectNumber();
		assertEquals(pn.isPerfect(6), true);
	}
	
	@Test
	public void testIsNotPerfectNumber() {
		PerfectNumber pn = new PerfectNumber();
		assertEquals(pn.isPerfect(7), false);
	}
	
	public static void main(String[] args) {
		PerfectNumber pn = new PerfectNumber();
		System.out.println("8128 is a perfect number: " + pn.isPerfect(8128));
	}

}
