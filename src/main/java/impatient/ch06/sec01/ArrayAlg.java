/*
 * Chapter 6  Generic Programming
 * Sec 1  Generic classes.
 * Defining a simple generic class.
 */
package impatient.ch06.sec01;

/**
 *
 * @author emaphis
 */
public class ArrayAlg {

   /**
    * Gets the minimum and maximum of an array of strings.
    * @param a an array of strings
    * @return a pair with the min and max values.
    */
   public static Pair<String> minmax(String[] a) {
      if (a == null || a.length == 0) return null;
      String min = a[0];
      String max = a[0];
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
