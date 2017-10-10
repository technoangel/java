package com.technoangel.hackerrank;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class BirthdayCake {

	public Integer solvesInvites(int vA, int vB, int cakeUnitsSize) {
		Double cus = vA * 1.0;
		Double desiredSize = (vB / cus);
		Double invites = desiredSize * cakeUnitsSize;
		return invites.intValue();
	}
	
	@Test
	public void verifyCakeSlices() {
		int cakeUnitsSize = 1;
		int vA = 5;
		int vB = 10;
		
		BirthdayCake bc = new BirthdayCake();
		Integer invites = bc.solvesInvites(vA, vB, cakeUnitsSize);
		assertEquals(invites, new Integer(2));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Parameters: ");
		String[] data = (in.nextLine()).split(" ");
		in.close();
		int[] numbers = Arrays.stream(data).mapToInt(Integer::parseInt).toArray();
		BirthdayCake bc = new BirthdayCake();
		Integer invites = bc.solvesInvites(numbers[0], numbers[1], numbers[2]);
		System.out.println(invites);
	}

}
