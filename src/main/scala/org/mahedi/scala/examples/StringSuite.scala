package org.mahedi.scala.examples

import java.util.regex.Pattern

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

  /**
   * This sort uses counting sort
   * I don't know yet if there is any better way to write this algorithm in Scala
   *
   * @param s
   *            s is string contains only alphabets [a-z][A=Z] where
   *            a<A<b<B...
   * @return sorted string by alphabet order
   */

  def sortByAlphabet(s: String): String = {
    if (s == null) throw new IllegalArgumentException()
    if (!Pattern.matches(".*[a-zA-Z]+.*[a-zA-Z]", s))
      throw new IllegalArgumentException("string contains non-letter characters");

    val alphabets = s.toCharArray()
    var c = new Array[Int](26 * 2)

    alphabets.foreach { ch =>
      var index: Int = -1
      if (ch >= 'A' && ch <= 'Z')
        index = (ch - 65) * 2 + 1
      else
        index = (ch - 97) * 2;
      c(index) = c(index) + 1;
    }
    for (i <- 1 to c.length - 1) {
      c(i) = c(i - 1) + c(i)
    }

    val sortedAlphabets = new Array[Char](alphabets.length)
    alphabets.foreach { ch =>
      var index: Int = -1
      if (ch >= 'A' && ch <= 'Z') {
        index = (ch - 65) * 2 + 1;
      } else {
        index = (ch - 97) * 2;
      }
      sortedAlphabets(c(index) - 1) = ch;
      c(index) = c(index) - 1;
    }
    var sb: StringBuilder = new StringBuilder()
    sortedAlphabets.foreach(ch => sb.append(ch))

    sb.toString()

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

    //sortByAlphabet
    println(StringSuite.sortByAlphabet("ZzaADBbdbZ"));

  }
}