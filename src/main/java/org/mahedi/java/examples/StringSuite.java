package org.mahedi.java.examples;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which
 * reads the same backward or forward, such as madam or kayak.
 * 
 * @author mahedi
 *
 */
public class StringSuite {

	/**
	 * 
	 * @param s
	 *            s is a string contains sequence of characters
	 * @return true/false
	 */
	public static boolean isPalindrome(String s) {
		if (s == null)
			throw new IllegalArgumentException("Argument was null!");
		int len = s.length();
		if (len == 0 || len == 1)
			return true;
		if (s.charAt(0) == s.charAt(len - 1))
			return isPalindrome(s.substring(1, len - 1));
		return false;
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public static String getReverse(String s) {

		if (s == null)
			throw new IllegalArgumentException("Argument was null!");
		int len = s.length();
		if (len == 0 || len == 1)
			return s;
		return getReverse(s.substring(1, len)) + s.charAt(0);
	}

	public static void main(String[] args) {
		// isPalindrome
		System.out.println(StringSuite.isPalindrome("madam"));
		System.out.println(StringSuite.isPalindrome("a"));
		System.out.println(StringSuite.isPalindrome(""));

		// getReverse
		System.out.println(StringSuite.getReverse("abcd"));
		System.out.println(StringSuite.getReverse("a"));


	}

}
