/*
 * Chapter 6  Generic Programming
 * Sec 6  Restrictions on Generics
 * At Runtime, All Types are Raw
 */
package impatient.ch06.sec06;

import java.util.ArrayList;
import java.util.function.IntFunction;

/**
 *
 * @author emaphis
 */
public class ArrayUtil {

   public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
      T[] result = constr.apply(n);
      for (int i = 0; i < n; i++) result[i] = obj;
      return result;
   }

   public static int[] repeat(int n, int obj, IntFunction<int[]> constr) {
      int[] result = constr.apply(n);
      for (int i = 0; i < n; i++) result[i] = obj;
      return result;
   }

   public static <T> T[] repeat(int n, T obj, T[] array) {
      T[] result;
      if (array.length >= n)
         result = array;
      else {
         @SuppressWarnings("unchecked")
         T[] newArray = (T[]) java.lang.reflect.Array.newInstance(
               array.getClass().getComponentType(), n);
         result = newArray;
      }
      for (int i = 0; i < n; i++) result[i] = obj;
      return result;
   }

   // heap polution.
   @SafeVarargs
   public static <T> ArrayList<T> asList(T... elements) {
      ArrayList<T> result = new ArrayList<>();
      for (T element : elements) result.add(element);
      return result;
   }
}
