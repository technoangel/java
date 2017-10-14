package org.technoangel.interview;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;

public class Reducer {
	
	/**
	 * Writes out the contents of the multidimensional array. 
	 * @param array Array of arrays
	 */
	public static void displayArray(double[][] array) {
		for (double[] seq : array) {
			for (double digit : seq) {
				System.out.print(digit + " ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------");
	}
	
	/**
	 * Convert an array to a stream. 
	 * @param array Array of arrays
	 * @return
	 */
	public DoubleStream streamifyArray(double[][] array) {
		return Arrays.stream(array).flatMapToDouble(x -> Arrays.stream(x));
	}
	
	/**
	 * Reduce a multidimensional array to a single value using a passable operation 
	 * @param array Array of arrays
	 * @param operation 2-operator function for processing the array of arrays
	 * @return
	 */
	public Double reduceArrays(double[][] array, BinaryOperator<Double> operation) {
		
		DoubleStream stream = streamifyArray(array);
		
		// answer reduces based on user function
		Double answer = stream.reduce(0, (double x, double y) -> operation.apply(x, y));
		return answer;
	}
}
