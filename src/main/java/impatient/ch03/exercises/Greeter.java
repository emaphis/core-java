/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercise 9
 */
package impatient.ch03.exercises;

/*
 Implement a class Greeter that implements Runnable and whose run method
prints n copies of "Hello, " + target, where n and target are set in the constructor.
Construct two instances with different messages and execute
them concurrently in two threads
 */

public class Greeter implements Runnable {
   private final int n;
   private final String target;

   public Greeter(int n, String target) {
      this.n = n;
      this.target = target;
   }

   @Override
   public void run() {
      for (int i = 0; i < n; i++) {
         System.out.println("Hello, " + target);
      }
   }

}
