/*
 * Chapter 5 Section 7 - Reflection
 * Invoking methods through reflection
 */
package vol1.chap05.sec07;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author emaphis
 */
public class MethodTableTest {
   public static void main(String[] args) throws NoSuchMethodException {
      // get method pointers to the square and sqrt methods
      Method square = MethodTableTest.class.getMethod("square", double.class);
      Method sqrt = MethodTableTest.class.getMethod("sqrt", double.class);

      // print tables of x- and y-values

      printTable(1, 10, 10, square);
      printTable(1, 10, 10, sqrt);
   }

   /**
    * Returns the square of a number
    * @param x a number
    * @return x squared
    */
   public static double square (double x) {
      return x * x;
   }

   public static double sqrt(double x) {
      return Math.sqrt(x);
   }
  
   /**
    * Prints a table with x- and y-values for a method
    * @param from the lower bound for the x-values
    * @param t0 the upper bound for the x-values
    * @param n the number of rows in the table
    * @param f a method with a double parameter and double return value
    */
   private static void printTable(double from, double to, int n, Method f) {
      // pring out the method as table header
      System.out.println(f);

      double dx = (to - from) / (n - 1);

      for (double x = from; x <= to; x += dx) {
         try {
            double y = (Double) f.invoke(null, x);
            System.out.printf("%10.4f | %10.4f%n", x, y);
         } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.getMessage();
         }
      }

   }
}
