/*
 * Chapter 1  Introduction
 * Sec 1.2 Boxing and Unboxing
 * Sec 1.4 Generic Methods and Varargs
 * pg 9,10,11
 */
package generics.ch01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class Lists {

   // Boxing and Unboxing
   // Type parameters must always be Objects
   public static int sum(List<Integer> ints) {
      int sum = 0;
      for (int num : ints) {
         sum += num;
      }
      return sum;
   }

      public static Integer sumInteger(List<Integer> ints) {
      Integer sum = 0;
      for (Integer num : ints) {
         sum += num;
      }
      return sum;
   }


   // Generic method.
   public static <T> List<T> toList1(T[] arr) {
      List<T> list = new ArrayList<>();
      for (T elt : arr) {
         list.add(elt);
      }
      return list;
   }

   // varargs
   public static <T> List<T> toList2(T... arr) {
      List<T> list = new ArrayList<>();
      for (T elt : arr) {
         list.add(elt);
      }
      return list;
   }

   public static <T> void addAll(List<T> list, T... arr) {
      for (T elt : arr) list.add(elt);
   }
}
