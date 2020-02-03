/*
 * Chapter 6  Generic Programming
 * Sec 2  Generic Methods
 *
 */
package impatient.ch06.sec02;

/**
 *
 * @author emaphis
 */
public class ArrayUtil {
   public static <T> void swap(T[] array, int i, int j) {
      T temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }

   public static <T> T[] swap(int i, int j, T... values) {
      T temp = values[i];
      values[i] = values[j];
      values[j] = temp;
      return values;
   }
}
