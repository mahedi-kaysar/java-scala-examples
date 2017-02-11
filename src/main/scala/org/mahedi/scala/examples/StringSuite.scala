package org.mahedi.scala.examples

/**
 * A palindrome is a word, phrase, number, or other sequence of characters 
 * which reads the same backward or forward, such as madam or kayak.
 * @author mahedi
 *
 */
object Palindrome {

 /**
	 * 
	 * @param s s is a string contains sequence of characters
	 * @return true/false
	 */
  def isPalindrome(s: String): Boolean = {
    val len = s.length()
    if (len == 0 || len == 1) return true
    if (s(0) == s(len - 1))
      return isPalindrome(s.substring(1, len - 1))
    return false
  }

  def main(args: Array[String]): Unit = {
    println(Palindrome.isPalindrome("aab"));
    println(Palindrome.isPalindrome("aa"));
    println(Palindrome.isPalindrome("an"));
    println(Palindrome.isPalindrome("a"));
    println(Palindrome.isPalindrome(""));
    println(Palindrome.isPalindrome(null));
  }
}