/*
 * Chapter 2  Subtyping and Wildcards
 * Sec 2.5  Arrays
 * pg 22
 */
package generics.ch02;

import java.util.Arrays;
import java.util.List;


/**
 *
 * @author emaphis
 */
public class Arrays1 {
   public static void main(String[] args) {
      example1();
      example2();
   }

   static void example1() {
      Integer[] ints = new Integer[] {1, 2, 3};
      Number[] nums = ints;
     // nums[2] = 3.14;
      System.out.println(Arrays.toString(ints));
     // assert Arrays.toString(ints).equals("[1, 2, 3.14]");
   }

   static void example2() {
      List<Integer> ints = Arrays.asList(1,2,3);
      //List<Number> nums = int; // compile time error.
      //nums.set(2, 3.14);
      System.out.println(ints.toString());
      assert ints.toString().equals("[1, 2, 3]");
   }
}
