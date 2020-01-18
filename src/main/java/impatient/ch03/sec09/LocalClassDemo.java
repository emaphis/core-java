/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 9 Local and Anonymous Classes
 * Local Classes
 */
package impatient.ch03.sec09;

import java.util.Random;

/**
 *
 * @author emaphis
 */
public class LocalClassDemo {

   public static void main(String[] args) {
      IntSequence dieTosses = randomInts(1, 6); // lazy sequence.
      for (int i = 0; i < 10; i++) System.out.println(dieTosses.next());
   }

   private static final Random generator = new Random();

   // local classes
   public static IntSequence randomInts(int low, int high) {

      // local class
      class RandomSequence implements IntSequence {
         @Override
         public int next() { return low + generator.nextInt(high - low + 1); }
         @Override
         public boolean hasNext() { return true; }  // infinite list.
      }

      return new RandomSequence();
   }

}
