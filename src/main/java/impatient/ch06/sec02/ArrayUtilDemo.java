/*
 * Chapter 6  Generic Programming
 * Sec 2  Generic Methods
 *
 */
package impatient.ch06.sec02;

import java.util.Arrays;

/**
 *
 * @author emaphis
 */
public class ArrayUtilDemo {
   public static void main(String[] args) {
      String[] friends = { "Peter", "Paul", "Mary" };
      ArrayUtil.swap(friends, 1, 0);
      System.out.println(Arrays.toString(friends));

     // Double[] result = Arrays.swap(0, 1, 1, 2, 3);
   }


}
