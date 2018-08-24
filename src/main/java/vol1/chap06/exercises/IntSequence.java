/*
 * Chapter 6 Exercises - Interfaces
 * Exercise 4, 5
 */
package vol1.chap06.exercises;

/**
 * Interface for a sequence of Integers.
 * @author emaphis
 */
public interface IntSequence {
   boolean hasNext();
   int next();

   static IntSequence of(int ... list) {
      return new IntSequence() {
         int idx = 0;

         @Override
         public boolean hasNext() {
            return idx < list.length; 
         }

         @Override
         public int next() {
            int num = 0;
            if (hasNext()) {
               num = list[idx];
               idx++;
            }
            return num;
         }
      };
   }

   static IntSequence constant(int con) {
      return new IntSequence() {
         private final int cons = con;

         @Override
         public boolean hasNext() {
            return true;
         }

         @Override
         public int next() {
            return cons;
         }
      };
   }
}
