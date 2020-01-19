/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercise 5.
 */
package impatient.ch03.exercises;

/*
Add a static method with the name constant of the IntSequence class that
yields an infinite constant sequence. For example, IntSequence.constant(1)
yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
lambda expression.
*/

// See IntSequence.java

public class Ex05 {

   public static void main(String[] args) {
      IntSequence constantly = IntSequence.constants(1);
      for (int i = 0; i < 10 && constantly.hasNext(); i++) {
         System.out.println(constantly.next());
      }
   }

}

