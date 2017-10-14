package com.technoangel.hackerrank;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class BirthdayCake {

	public Integer solvesInvites(int sliceNumerator, int sliceDenominator, int cakeUnitsSize) {
		Double cus = sliceNumerator * 1.0;
		Double desiredSize = (sliceDenominator / cus);
		Double invites = desiredSize * cakeUnitsSize;
		return invites.intValue();
	}
	
	@Test
	public void verifyCakeSlices() {
		int cakeUnitsSize = 1;
		int sliceNumerator = 5;
		int sliceDenominator = 10;
		
		BirthdayCake bc = new BirthdayCake();
		Integer invites = bc.solvesInvites(sliceNumerator, sliceDenominator, cakeUnitsSize);
		assertEquals(invites, new Integer(2));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Parameters (Cake fraction - numerator, Cake fraction - denominator, Units of cake size): ");
		String[] data = (in.nextLine()).split(" ");
		in.close();
		int[] numbers = Arrays.stream(data).mapToInt(Integer::parseInt).toArray();
		BirthdayCake bc = new BirthdayCake();
		Integer invites = bc.solvesInvites(numbers[0], numbers[1], numbers[2]);
		System.out.println(invites);
	}

}
