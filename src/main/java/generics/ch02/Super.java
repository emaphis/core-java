/*
 * Chapter 2  Subtyping and Wildcards
 * Sec 2.3  Wildcards with super.
 * pg 18
 */
package generics.ch02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * public static <T> void copy(List<? super T> dst, List<? extends T> src)
 * @author emaphis
 */
public class Super {
   public static void main(String[] args) {
      example1();
   }

   static void example1() {
      List<Object> objs = Arrays.asList(2, 3.14, "four");
      List<Integer> ints = Arrays.asList(5, 6);

      Collections.copy(objs, ints);
      assert objs.toString().equals("[5, 6, four]");
   }
}
