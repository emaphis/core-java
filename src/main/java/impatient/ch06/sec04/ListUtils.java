/*
 * Chapter 6  Generic Programming
 * Sec 4  Type Variance and Wildcards
 * Unbound Wildcards
 */
package impatient.ch06.sec04;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class ListUtils {

   // Unbound wildcards
   public static boolean hasNulls(ArrayList<?> elements) {
      for (Object element : elements) {
         if (element == null) return true;
      }
      return false;
   }

   public static void swap(ArrayList<?> elements, int i, int j) {
    //  ? temp = elements.get(i);  // Wont work
    //  elements.set(i, elements.get(j));
    //  elements.set(j, temp);
      swapHelper(elements, i, j);
   }

   private static <T> void swapHelper(ArrayList<T> elements, int i, int j) {
      T temp = elements.get(i);
      elements.set(i, elements.get(j));
      elements.set(j, temp);
   }
}
