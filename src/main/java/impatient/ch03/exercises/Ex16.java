/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;

import java.util.Random;

/*
Implement the RandomSequence in Section 3.9.1, “Local Classes” (page 129) as
a nested class, outside the randomInts method
 */
/**
 * @author emaphis
 */
public class Ex16 {

   public static void main(String[] args) {
      IntSequence dieTosses = randomInts(1, 6); // lazy sequence.
      for (int i = 0; i < 10; i++) {
         System.out.println(dieTosses.next());
      }
   }

   // local class
   static class RandomSequence implements IntSequence {
      private final int low;
      private final int high;
      private final Random generator = new Random();

      public RandomSequence(int low, int high) {
         this.low = low;
         this.high = high;
      }

      @Override
      public Integer next() {
         return low + generator.nextInt(high - low + 1);
      }

     // public boolean hasNext() // is defualt
   }

   public static IntSequence randomInts(int low, int high) {
      return new RandomSequence(low, high);
   }

}
