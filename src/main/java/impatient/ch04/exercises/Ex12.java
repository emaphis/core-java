/*
 * Chapter 4  Inheritance and Reflection
 * Exercises
 */
package impatient.ch04.exercises;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/*
Measure the performance difference between a regular method call and
a method call via reflection.

Sample run:
Time of 100000000 iterations of direct call: 1968
Time of 100000000 iterations of invoke call: 2740
Time of 100000000 iterations of direct call: 1812
Time of 100000000 iterations of invoke call: 2544
Time of 100000000 iterations of direct call: 1904
Time of 100000000 iterations of invoke call: 2552
*/

/**
 * @author emaphis
 */

class SomeClass {
   public double someCalculation(double data) {
      return Math.sin(data);
   }
}

public class Ex12 {

   public static void main(String[] args) {
      int iterations = 100_000_000;
      callDirect(iterations);
      callInvoke(iterations);
      callDirect(iterations);
      callInvoke(iterations);
      callDirect(iterations);
      callInvoke(iterations);
   }

   static void callDirect(int iterations) {
      SomeClass calc = new SomeClass();
      long start = System.currentTimeMillis();

      for (int i = 0; i < iterations; i++) {
         double whatever = calc.someCalculation(2 * Math.PI);
         //System.out.println("whatever: " + whatever);
      }

      long end = System.currentTimeMillis();
      System.out.println("Time of " + iterations + " iterations of direct call: " + (end - start));
   }

   static void callInvoke(int iterations) {
      long start = System.currentTimeMillis();

      try {
         SomeClass someObject = new SomeClass();
         Method method = SomeClass.class.getDeclaredMethod("someCalculation", double.class);
         for (int i = 0; i < iterations; i++) {
            double whatever = (Double) method.invoke(someObject, 2 * Math.PI);
            //System.out.println("whatever: " + whatever);
         }
      } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | SecurityException ex) {
         System.err.println(ex.toString());
      }

      long end = System.currentTimeMillis();
      System.out.println("Time of " + iterations + " iterations of invoke call: " + (end - start));
   }
}
