/*
 * Chapter 6  Generic Programming
 * Sec 2 Generic methods
 */
package impatient.ch06.sec02;

import impatient.ch06.sec01.Pair;

/**
 *
 * @author emaphis
 */
public class ArrayAlg2 {

   /**
    * Gets the minimum and maximum of an array of type T.
    * @param <T> type of objects to be compared
    * @param a an array of type T.
    * @return a pair with the min and max values.
    */
   public static <T extends Comparable> Pair<T> minmax(T[] a) {
      if (a == null || a.length == 0) return null;
      T min = a[0];
      T max = a[0];
      for (int i = 1; i < a.length; i++) {
         if (min.compareTo(a[i]) > 0) min = a[i];
         if (max.compareTo(a[i]) < 0) max = a[i];
      }
      return new Pair<>(min, max);
   }

   // Generic methods
   public static <T> T getMiddle(T... a) {
      return a[a.length / 2];
   }
}
