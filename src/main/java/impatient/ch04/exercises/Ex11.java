/*
 * Chapter 4  Inheritance and Reflection
 * Exercise 11
 */
package impatient.ch04.exercises;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/*
Write the “Hello, World” program, using reflection to look up the out field
of java.lang.System and using invoke to call the println method
*/

/**
 * @author emaphis
 */
public class Ex11 {

   public static void main(String[] args)
         throws InstantiationException, ClassNotFoundException, NoSuchFieldException,
         IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
      String className = "java.lang.System";
      String fieldName = "out";
      String methodName = "println";
      String parameter = "Hello, World!";

      Class<?> cls = Class.forName(className);
      Field field = cls.getDeclaredField(fieldName);
      Object obj = field.get(null);
      Method method = obj.getClass().getDeclaredMethod(methodName, String.class);
      method.invoke(obj, parameter);
   }

   // I can't beleive this worked.
}
