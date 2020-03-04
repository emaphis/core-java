/*
 * Chapter 2  Subtyping and Wildcards
 * Sec 2.2  Wildcards with extends.
 * pg 17
 */
package generics.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
   interface Collectio<E> {
      public boolean addAll(Collection<? extends E> c);
   }
*/

/**
 *
 * @author emaphis
 */
public class Wildcards {
   public static void main(String[] args) {
      example1();
   }

   static void example1() {
      List<Number> nums = new ArrayList<>();
      List<Integer> ints = Arrays.asList(1, 2);
      List<Double> dbls = Arrays.asList(2.78, 3.14);
      nums.addAll(ints);
      nums.addAll(dbls);
      assert nums.toString().equals("[1, 2, 2.78, 3.14]");
   }
}
