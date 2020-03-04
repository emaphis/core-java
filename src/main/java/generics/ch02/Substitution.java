/*
 * Chapter 2  Subtyping and Wildcards
 * Sec 2.1  Subtyping and the Substitution Principle
 * pg 16
 */
package generics.ch02;

import java.util.ArrayList;
import java.util.List;

/**
 * Substitution principle.
 * @author emaphis
 */
public class Substitution {
   public static void main(String[] args) {
      example1();
      example2();
   }

   static void example1() {
      List<Number> nums = new ArrayList<>();
      nums.add(2);  // Integer
      nums.add(3.14); // Double
      assert nums.toString().equals("[2, 3.14]");
   }

   // List<Integer> is not a subtype of List<Number>
   static void example2() {
      List<Integer> ints = new ArrayList<>();
      ints.add(1);
      ints.add(2);
      //List<Number> nums = ints;  // won't compile.
      assert ints.toString().equals("[1, 2]");
   }
}
