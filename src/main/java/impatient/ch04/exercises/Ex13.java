/*
 * Chapter 4  Inheritance and Reflection
 * Exercises
 */
package impatient.ch04.exercises;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;
import java.util.function.DoubleFunction;


/*
Write a method that prints a table of values for any Method representing a
static method with a parameter of type double or Double. Besides the Method
object, accept a lower bound, upper bound, and step size. Demonstrate
your method by printing tables for Math.sqrt and Double.toHexString. Repeat,
using a DoubleFunction<Object> instead of a Method (see Section 3.6.2, “Choosing
a Functional Interface,” page 120). Contrast the safety, efficiency, and
convenience of both approaches.
*/

/**
 * @author emaphis
 */
public class Ex13 {

   public static void main(String[] args) {
      try {
         printTable(Math.class.getMethod("sqrt", double.class), 0, 16, 1);
         System.out.println("=====================================");
         printTable(Double.class.getMethod("toHexString", double.class), 0, 16, 1);
      } catch (NoSuchMethodException ex) {
         System.err.println(ex.toString());
      }

      System.out.println("=====================================");
      printTable2(Math::sqrt, 0, 16, 1);
      System.out.println("=====================================");
      printTable2(Double::toHexString, 0, 16, 1);
   }

   static void printTable(Method method, double lower, double upper, double step) {
      try {
         String str = method.getDeclaringClass().getCanonicalName() + "." + method.getName();
         System.out.println(str);
         for (double par = lower; par <= upper; par += step) {
            Object ret = method.invoke(method.getDeclaringClass(), par);
            System.out.println("Parameter: " + par + " returns: " + ret.toString());
         }
      } catch (IllegalAccessException | InvocationTargetException ex) {
         System.err.println(ex.toString());
      }
   }


   static void printTable2(DoubleFunction<Object> fun, double lower, double upper, double step) {
      String str = fun.toString();
      System.out.println(str);
      for (double par = lower; par <= upper; par += step) {
         Object ret = fun.apply(par);
         System.out.println("Parameter: " + par + " returns: " + ret.toString());
      }
   }
}
