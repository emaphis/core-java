/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exercises 11
 */
package impatient.ch05.exercises;

import java.math.BigInteger;

/*
Write a recursive factorial method in which you print all stack frames
before you return the value. Construct (but don’t throw) an exception
object of any kind and get its stack trace, as described in Section 5.1.8,
“Uncaught Exceptions and the Stack Trace” (page 192).
*/


/**
 * @author emaphis
 */
public class Ex11 {

   static public long factorial(long num) {

      if (num <= 1) {
         new Throwable().printStackTrace();
         return 1;
      }
      else {
         long ret = num * factorial(num - 1);
         return ret;
      }
   }

   public static void main(String[] args) {
      long ret = factorial(6);
      System.out.println(ret);
   }
}
