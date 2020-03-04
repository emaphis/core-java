/*
 * Chapter 2  Subtyping and Wildcards
 * Sec 2.4  The Get and Put Principle
 * pg 17
 */
package generics.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* NOTE:
The Get and Put Principle: use an extends wildcard when you only get values
out of a structure, use a super wildcard when you only put values into a
structure, and don’t use a wildcard when you both get and put.

'? extends T' - as contains every type in an interval bounded by the
               type of null below and by T above

'? super T' - contains every type in an interval bounded by T below
              and by Object above.
*/


/**
 * @author emaphis
 */
public class GetPut {

   public static void main(String[] args) {
      example1();
      example2();
      example3();
   }

   // gets
   public static double sum(Collection<? extends Number> nums) {
      double s = 0.0;
      for (Number num : nums) {
         s += num.doubleValue();
      }
      return s;
   }

   static void example1() {
      List<Integer> ints = Arrays.asList(1, 2, 3);
      assert sum(ints) == 6.0;

      List<Double> doubles = Arrays.asList(2.78, 3.14);
      assert sum(doubles) == 5.92;

      List<Number> nums = Arrays.asList(1, 2, 2.78, 3.14);
      assert sum(nums) == 8.92;
   }

   // puts
   public static void count(Collection<? super Integer> ints, int n) {
      for (int i = 0; i < n; i++) {
         ints.add(i);
      }
   }

   static void example2() {
      List<Integer> ints = new ArrayList<>();
      count(ints, 5);
      assert ints.toString().equals("[0, 1, 2, 3, 4]");

      List<Number> nums = new ArrayList<>();
      count(nums, 5);
      nums.add(5.0);
      assert nums.toString().equals("[0, 1, 2, 3, 4, 5.0]");

      List<Object> objs = new ArrayList<>();
      count(objs, 5);
      objs.add("five");
      assert objs.toString().equals("[0, 1, 2, 3, 4, five]");
   }

   // get and put
   public static double sumCount(Collection<Number> nums, int n) {
      count(nums, n);
      return sum(nums);
   }

   static void example3() {
      List<Number> nums = new ArrayList<>();
      double sum = sumCount(nums, 5);
      assert sum == 10;
   }

   // illegal
   //double sumCount1(Collection<? extends Number super Integer> coll, int n) { return 0; }
   static void example4() {
      List<Integer> ints = new ArrayList<>();
      ints.add(1);
      ints.add(2);
      List<? extends Number> nums1 = ints;
      double dbl = sum(nums1);  // ok.  gets
      //nums.add(3.14);

      List<Object> objs = new ArrayList<Object>();
      objs.add(1);
      objs.add("two");
      List<? super Integer> ints2 = objs;
      ints2.add(3); // ok  puts
      //double dbl = sum(ints2); // compile-time error
   }
}
