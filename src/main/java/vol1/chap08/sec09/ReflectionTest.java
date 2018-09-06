/*
 * Chapter 8 - Generics
 * Sec 9 - Reflection
 */
package vol1.chap08.sec09;

import vol1.chap08.sec02.Pair;
import vol1.chap08.sec05.Employee;

/**
 * Test reflection with generic class
 * @author emaphis
 */
public class ReflectionTest {
   public static <T> Pair<T> makePair(Class<T> c)
         throws InstantiationException, IllegalAccessException {
      return new Pair<>(c.newInstance(), c.newInstance());
   }

   public static void main(String[] args) {
      try {
         Pair<Employee> pair = makePair(Employee.class);
      } catch (InstantiationException | IllegalAccessException ex) {
         System.err.println("error: " + ex);
      }
   }
}
