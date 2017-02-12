package org.mahedi.scala.examples

/**
 * A palindrome is a word, phrase, number, or other sequence of characters
 * which reads the same backward or forward, such as madam or kayak.
 * @author mahedi
 *
 */
object StringSuite {

  /**
   *
   * @param s s is a string contains sequence of characters
   * @return true/false
   */
  def isPalindrome(s: String): Boolean = {
    if (s == null) throw new IllegalArgumentException()

    val len = s.length()
    if (len == 0 || len == 1) return true
    if (s(0) == s(len - 1))
      return isPalindrome(s.substring(1, len - 1))
    return false
  }

  /**
   *
   */
  def getReverse(s: String): String = {
    if (s == null) throw new IllegalArgumentException()
    val len = s.length()
    if (len == 0 || len == 1) return s
    else
      return getReverse(s.substring(1, len)) + s(0)
  }
  def main(args: Array[String]): Unit = {
    //isPalindrome
    println(StringSuite.isPalindrome("bob"))
    println(StringSuite.isPalindrome("ab"))
    println(StringSuite.isPalindrome("a"))
    println(StringSuite.isPalindrome(""))
    //println(Palindrome.isPalindrome(null));

    //getReverse
    println(StringSuite.getReverse("abcd"))
    println(StringSuite.getReverse("a"))

  }
}