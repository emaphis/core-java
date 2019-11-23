/*
 * Exercises chp 1
 * Ex10.java
 */
package impatient.ch01.exercises;

import java.util.Random;

/**
 * Write a program that produces a random string of letters and digits by
 * generating a random long value and printing it in base 36.
 * @author emaphis
 */
public class Ex10 {
   public static void main(String[] args) {
      Random generator = new Random();
      long num = generator.nextLong();
      String str = Long.toUnsignedString(num, 36);
      System.out.println("random string: " + str);
   }
}
