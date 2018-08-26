/*
 * Chapter 7 - Excetpions
 * Sec 2 - Catching exceptions
 */
package vol1.chap07.sec02;

import java.util.Scanner;

/**
 * Display a stack trace.
 * @author emaphis
 */
public class StackTraceTest {

   /**
    * Computes the factorial of a number
    * @param n a non-negative number
    * @return n! = 1 * 2 * ... * n 
    */
   public static int factorial(int n) {
      System.out.println("factorial(" + n + ")");
      Throwable t = new Throwable();
      StackTraceElement[] frames = t.getStackTrace();
      for (StackTraceElement f : frames) {
         System.out.println(f);
      }
      int r;
      if (n <= 1) r = 1;
      else r = n * factorial(n - 1);
      System.out.println("return " + r);
      return r;
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter n: ");
      int n = in.nextInt();
      factorial(n);
   }
}
