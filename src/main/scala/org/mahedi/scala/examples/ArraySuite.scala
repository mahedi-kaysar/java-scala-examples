package org.mahedi.scala.examples

import scala.util.Sorting

/**
 * 
 * @author mahedi
 *
 */
object ArraySuite {

  /**
   * 
   */
  def getMaxValue(values: Array[Int]): Int = {
    if (values == null) throw new IllegalArgumentException()
    Sorting.quickSort(values)
    return values(values.length - 1)
  }

  def main(args: Array[String]): Unit = {
    //getMaxValue
    val values = Array(4, 3, 7, 5, 9, 0)
    println(ArraySuite.getMaxValue(values));

  }
}