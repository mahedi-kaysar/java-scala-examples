/**
 * 
 */
package org.mahedi.examples;

import org.junit.Test;
import org.mahedi.java.examples.ArraySuite;
import org.mahedi.java.examples.StringSuite;

import static org.junit.Assert.*;

/**
 * @author mahedi
 *
 */
public class ArraySuiteTest {

	/**
	 * 
	 * Test method for checking null input to
	 * {@link org.mahedi.java.examples.ArraySuite#getMaxValue(java.lang.int[])}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMaxValueMethodForNullParam() {

		int[] values = null;
		ArraySuite.getMaxValue(values);
	}

}
