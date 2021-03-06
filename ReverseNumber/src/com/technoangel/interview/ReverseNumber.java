package com.technoangel.interview;

public class ReverseNumber {

	public Integer reverse(Integer number) {
		Integer reverse = 0;
		
		while(number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		Integer number = 33443;
		ReverseNumber rn = new ReverseNumber();
		System.out.println(number + " => " + rn.reverse(number));

	}

}
