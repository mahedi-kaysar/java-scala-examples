package org.mahedi.java.examples;

import java.util.Arrays;
import java.util.regex.Pattern;

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

	/**
	 * This sort uses counting sort
	 * 
	 * @param s
	 *            s is string contains only alphabets [a-z][A=Z] where
	 *            a<A<b<B...
	 * @return sorted string by alphabet order
	 */
	public static String sortByAlphabet(String s) {
		if (s == null)
			throw new IllegalArgumentException("Argument was null!");
		if (!Pattern.matches(".*[a-zA-Z]+.*[a-zA-Z]", s))
			throw new IllegalArgumentException("string contains non-letter characters");

		char[] alphabets = s.toCharArray();
		/*
		 * count the frequency of characters and character's indexes are
		 * calculated checking odd or even position. for example, index of a =
		 * 0, A = 1, b= 2, B = 3 ... z = 50, Z = 51
		 */
		int[] c = new int[26 * 2];
		for (char ch : alphabets) {
			int index;
			if (ch >= 'A' && ch <= 'Z')
				index = (ch - 65) * 2 + 1;
			else
				index = (ch - 97) * 2;
			c[index]++;
			System.out.println(index);
		}

		// Commutative some
		for (int i = 1; i < 26 * 2; i++)
			c[i] = c[i - 1] + c[i];

		char[] sortedAlphabets = new char[alphabets.length];
		// sort the array and get a new sorted array
		for (char ch : alphabets) {
			int index;
			if (ch >= 'A' && ch <= 'Z') {
				index = (ch - 65) * 2 + 1;
			} else {
				index = (ch - 97) * 2;
			}
			sortedAlphabets[c[index] - 1] = ch;
			--c[index];
		}
		// convert chart array to string
		StringBuffer sb = new StringBuffer();
		for (char ch : sortedAlphabets)
			sb.append(ch);
		return sb.toString();
	}

	public static void main(String[] args) {
		// isPalindrome
		System.out.println(StringSuite.isPalindrome("madam"));
		System.out.println(StringSuite.isPalindrome("a"));
		System.out.println(StringSuite.isPalindrome(""));

		// getReverse
		System.out.println(StringSuite.getReverse("abcd"));
		System.out.println(StringSuite.getReverse("a"));

		// sortByAlphabet
		System.out.println(StringSuite.sortByAlphabet("ZzaADBbdbZ"));

	}

}
