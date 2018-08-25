/*
 * Chapter 6 - Interaces
 * Exercise 9
 */
package vol1.chap06.exercises;

/**
 * Greeter - prints n greet messages
 * @author emaphis
 */
public class Greeter implements Runnable {
   private final int n;
   private final String mess;

   public Greeter (int num, String message) {
      this.n = num;
      this.mess = message;
   }

   @Override
   public void run() {
      for (int i = 0; i < n; i++) {
         System.out.println("Hello, " + mess);
      }
   }
}
