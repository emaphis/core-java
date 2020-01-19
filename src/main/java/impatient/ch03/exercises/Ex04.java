/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises 4
 */
package impatient.ch03.exercises;

/*
Implement a static of method of the IntSequence class that yields a sequence
with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
sequence with six values. Extra credit if you return an instance of an
anonymous inner class.
*/

// See IntSequence.java

public class Ex04 {

   public static void main(String[] args) {
      IntSequence iSeq = IntSequence.of(3, 1, 4, 1, 5, 9);
      while (iSeq.hasNext()) {
         int i = iSeq.next();
         System.out.println("i: " + i);
      }
   }

}
