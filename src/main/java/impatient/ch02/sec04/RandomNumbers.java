/*
 * Chapter 2 Object-Oriented Programming
 * 2.4 Static Variables and Methods
 * RandomNumbers.java
 */

package impatient.ch02.sec04;

import java.util.Random;

/**
 * Static Methods
 * @author emaphis
 */
public class RandomNumbers {
   private static Random generator = new Random();

   public static int nextInt(int low, int high) {
      return low + generator.nextInt(high - low + 1);
   }
}
