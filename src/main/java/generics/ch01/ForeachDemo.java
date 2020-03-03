/*
 * Chapter 1  Introduction
 * Sec 1.3 Foreach
 * pg 9
 */
package generics.ch01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author emaphis
 */
public class ForeachDemo {

   public static void main(String[] args) {
      List<Integer> ints = Arrays.asList(1,2,3);
      int sum = 0;
      // forech works on anything that works for anything defined by Iterable
      for (Integer n : ints) {
         sum += n;
      }

      System.out.println(sum);
      assert sum == 6;

      // foreach uses iterators.
      sum = 0;
      for (Iterator<Integer> it = ints.iterator(); it.hasNext();) {
         Integer n = it.next();
         sum += n;
      }

      assert sum == 6;

      int[] ar = new int[] {1, 2, 3};
      sum = sumArray(ar);

      assert sum == 6;
   }

   public static int sumArray(int[] ar) {
      int sum = 0;
      for (int num : ar) {
         sum += num;
      }
      return sum;
   }
}
