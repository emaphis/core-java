/*
 * Chapter 6  Generic Programming
 * Sec 3  Bounds for Type Variables
 */
package impatient.ch06.sec03;

import impatient.ch06.sec01.Pair;

/**
 *
 * @author emaphis
 */
public class ArrayAlg3 {

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

   public static <T extends Comparable> T min(T[] a) {
      if (a == null || a.length == 0) return null;
      T smallest = a[0];
      for (int i = 1; i < a.length; i++) {
         if (smallest.compareTo(a[i]) > 0) smallest = a[i];
      }
      return smallest;
   }
}
