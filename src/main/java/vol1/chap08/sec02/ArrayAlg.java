/*
 * Chapter 8 - Generics
 */
package vol1.chap08.sec02;

/**
 *
 * @author emaphis
 */
public class ArrayAlg {
   /**
    * Section 2 - Simple generic class
    *  Gets the minimum and and maximum of an array of Strings.
    * @param a String array
    * @return Pair of min and max
    */
   public static Pair<String> minmaxStr(String[] a) {
      if (a == null || a.length == 0) return null;
      String min = a[0];
      String max = a[0];
      for (int i = 1; i < a.length; i++) {
         if (min.compareTo(a[i]) > 0) min = a[i];
         if (max.compareTo(a[i]) < 0) max = a[i];
      }
      return new Pair<>(min,max);
   }

   /**
    * 
    * @param <T> Type of array
    * @param a array containing max and min.
    * @return null if empty array or pair of max and min.
    */
   public static <T> T getMiddle(T... a) {
      return a[a.length / 2];
   }

   public static <T extends Comparable> T min(T[] a) {
      if (a == null || a.length == 0) return null;
      T smallist = a[0];
      for (int i = 1; i < a.length; i++) {
         if (smallist.compareTo(a[i]) > 0) smallist = a[i];
      }
      return smallist;
   }

   /**
    * Section 4 Bounds for type variables
    * Gets the minimum and and maximum of an array of objects of type T.
    * @param <T> Type of array a.
    * @param a an array of objects of type T
    * @return a pair with the min and max value, or null if a is null or empty
    */
   public static <T extends Comparable> Pair<T> minmax(T[] a) {
      if (a==null || a.length == 0) return null;
      T min = a[0];
      T max = a[0];
      for (int i = 0; i < a.length; i++) {
         if (min.compareTo(a[i]) > 0) min = a[i];
         if (max.compareTo(a[i]) < 0) max = a[i];
      }
      return new Pair<>(min,max);
   }
}
