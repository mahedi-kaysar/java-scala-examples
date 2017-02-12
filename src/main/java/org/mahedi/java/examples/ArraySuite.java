package org.mahedi.java.examples;

import java.util.Arrays;

/**
 * 
 * @author mahedi
 *
 */
public class ArraySuite {
	/**
	 * 
	 * @param values
	 * @return max integer value
	 */
	public static int getMaxValue(int[] values) {
		if (values == null)
			throw new IllegalArgumentException();
		Arrays.sort(values);
		return values[values.length - 1];
	}

	public static void main(String[] args) {
		int[] values = {4,3,7,5,9,0};
		System.out.println(ArraySuite.getMaxValue(values));
	}
}
