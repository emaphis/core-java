/*
 * Chapter 8 Generics
 * Section Lower Bounded Wildcards
 */
package vol1.chap08.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class TestLowerBounded {

   // Hold any type of Number
   public static void addNumbers(List<? super Integer> list) {
      for (int i = 1; i <= 10; i++) {
         list.add(i);
      }
   }

   public static void main(String[] args) {
      List<Integer> li = new ArrayList<>();
      List<Double> ld = new ArrayList<>();
      List<Number> ln = new ArrayList<>();
      addNumbers(li);
      System.out.println("Integers: " + li);
     // addNumbers(ld);
     // System.out.println("Doubles: " + ld);
      addNumbers(ln);
      System.out.println("Numbers: " + ln);
   }
}
