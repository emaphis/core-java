/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;

/*
Write a method that takes an array of Runnable instances and returns a
Runnable whose run method executes them in order. Return a lambda
expression.
*/

/**
 * @author emaphis
 */
public class Ex14 {

   public static void main(String[] args) {
      Runnable[] runnables = new Runnable[] {
         () -> System.out.println("Let's start."),
         () -> System.out.println("Hello."),
         () -> System.out.println("Good bye."),
         () -> System.out.println("Done.")
      };

      runInOrder(runnables).run();
   }

   static Runnable runInOrder(Runnable[] runnables) {
      return () -> {
         for (Runnable runnable : runnables) {
            runnable.run();
         }
      };

   }
}
