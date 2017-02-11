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

	public static void main(String[] args) {
		System.out.println(StringSuite.isPalindrome("madam"));
		System.out.println(StringSuite.isPalindrome("aab"));
		System.out.println(StringSuite.isPalindrome("aa"));
		System.out.println(StringSuite.isPalindrome("an"));
		System.out.println(StringSuite.isPalindrome("a"));
		System.out.println(StringSuite.isPalindrome(""));
		System.out.println(StringSuite.isPalindrome(null));

	}

}
