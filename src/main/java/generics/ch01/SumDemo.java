/*
 * Chapter 1 Generic Programming
 *
 */
package generics.ch01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class SumDemo {
   public static void main(String[] args) {
      example1();
      example2();
   }

   // Generics
   static void example1() {
      List<Integer> ints = Arrays.asList(1,2,3);
      int sum = 0;
      for (int n : ints) { sum += n; }
      System.out.println("sum = " + sum);
   }

   // Before generics
   static void example2() {
      List ints  = Arrays.asList(new Integer[] {
         new Integer(1), new Integer(2), new Integer(3)
      });
      int sum = 0;
      for (Iterator it = ints.iterator(); it.hasNext();) {
         int n = ((Integer)it.next()).intValue();
         sum += n;
      }
      System.out.println("sum = " + sum);
   }
}
