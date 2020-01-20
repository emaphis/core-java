/*
 * Chapter 4  Inheritance and Reflection
 * Sec 5  Reflection
 * Enumerating Class Members
 */
package impatient.ch04.sec05;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author emaphis
 */
public class MethodPrinter {

   public static void main(String[] args) {
      try {
         System.out.print("Class name: ");
         Scanner in = new Scanner(System.in);
         String className = in.nextLine();

         Class<?> cl = Class.forName(className);
         while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) {
               System.out.println(
                     Modifier.toString( m.getModifiers()) + " " +
                           m.getReturnType().getCanonicalName() + " " +
                           m.getName() +
                           Arrays.toString(m.getParameters()));
            }
            cl = cl.getSuperclass();
         }
      } catch (ClassNotFoundException ex) {
        System.err.println(ex.toString());
      }
   }
}
