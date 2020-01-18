/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 9 Local and Anonymous Classes
 * Anonymous Classes
 */
package impatient.ch03.sec09;

import java.util.Random;

/**
 *
 * @author emaphis
 */
public class AnonymousClassDemo {

   public static void main(String[] args) {
      IntSequence dieTosses = randomInts(1, 6);
      for (int i = 0; i < 10; i++) System.out.println(dieTosses.next());
   }

   private static Random generator = new Random();
   
   public static IntSequence randomInts (int low, int high) {
      return new IntSequence() {
         @Override
         public int next() { return low + generator.nextInt(high - low + 1); }
         @Override
         public boolean hasNext() { return true; }
      };
   }

}
