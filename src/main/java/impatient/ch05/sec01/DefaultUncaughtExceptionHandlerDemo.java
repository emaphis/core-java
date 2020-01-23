/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Sec 1  Exception Handling
 *   1.8  Uncaught Exceptions and the Stack Trace.
 */
package impatient.ch05.sec01;

/**
 *
 * @author emaphis
 */
public class DefaultUncaughtExceptionHandlerDemo {

   public static void main(String[] args) {
      Thread.setDefaultUncaughtExceptionHandler((thread, ex) -> {
         System.err.println(ex.toString());
         System.err.println("Goodbye, cruel world!");
      });

      System.out.println(1 / 0);
   }
}
