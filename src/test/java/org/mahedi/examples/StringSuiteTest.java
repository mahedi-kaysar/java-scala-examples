/**
 * 
 */
package org.mahedi.examples;

import org.junit.Test;
import org.mahedi.java.examples.StringSuite;

import static org.junit.Assert.*;

/**
 * @author mahedi
 *
 */
public class StringSuiteTest {

	/**
	 * 
	 * Test method for checking null input to
	 * {@link org.mahedi.java.examples.StringSuite#check(java.lang.String)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testIsPalindromeForNullParam() {
		String s = null;
		StringSuite.isPalindrome(s);
	}
	
	/**
	 * 
	 * Test method for checking string length less than 2
	 * {@link org.mahedi.java.examples.StringSuite#check(java.lang.String)}.
	 */
	@Test
	public void testIsPalindromeForLengthLessThanTwo() {
		String s = "a";
		assertEquals("", true, StringSuite.isPalindrome(s));
		
	}
	
	/**
	 * 
	 * Test method for checking null input to
	 * {@link org.mahedi.java.examples.StringSuite#getReverse(java.lang.String)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetReverseMethodForNullParam(){
		String s = null;
		StringSuite.getReverse(s);
	}
}
