/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises 4,5
 */
package impatient.ch03.exercises;

/**
 *
 * @author emaphis
 */
public interface IntSequence {
   default boolean hasNext() { return true; }
   Integer next();

   // Exercise 4.
   static IntSequence of(Integer ... vals) {
      return new IntSequence() {
         int index = 0;

         @Override
         public boolean hasNext() {
            return index < vals.length;
         }

         @Override
         public Integer next() {
            if (hasNext()) {
               int val = vals[index];
               index++;
               return val;
            }
            else {
               return null;
            }
         }
      };
   }

   // Exercise 5.
   static IntSequence constants(int n) {
      return () -> n;
   }

}