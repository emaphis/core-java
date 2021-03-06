/*
 * DoDemo.java
 *
 */
package impatient.ch01.sec07;

import java.util.Random;

/**
 * Do loop demo
 * @author emaphis
 */
public class DoDemo {
   public static void main(String[] args) {
      Random generator = new Random();
      int target = 5;
      int count = 1;
      int next;
      do {
         next = generator.nextInt(10);
         count++;
      } while (next != target);

      System.out.println("After " + count + " iterations, there was a values of " + target);
   }
}
