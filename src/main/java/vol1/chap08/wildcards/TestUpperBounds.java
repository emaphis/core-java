/*
 * Chapter 8 Generics
 * Section Wildcards Upper Bounds
 */
package vol1.chap08.wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * Upper Bounds
 * @author emaphis
 */
public class TestUpperBounds {

   // Sum Number and subclasses Integers, Doubles
   public static double sumOfList(List<? extends Number> list) {
      double s = 0.0;
      for (Number n : list) {
         s += n.doubleValue();
      }
      return s;
   }

   public static void main(String[] args) {
      List<Integer> li = Arrays.asList(1, 2, 3);
      System.out.println("sum = " + sumOfList(li));

      List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
      System.out.println("sum = " + sumOfList(ld));

      List<Number> ln = Arrays.asList(1, 2.0, 3);
      System.out.println("sum = " + sumOfList(ln));
   }
}
