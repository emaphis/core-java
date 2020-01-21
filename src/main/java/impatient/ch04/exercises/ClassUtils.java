/*
 * Chapter 4  Inheritance and Reflection
 * Exercises 9
 */
package impatient.ch04.exercises;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 *
 * @author emaphis
 */
public class ClassUtils {

   /**
    * Universal toString function.
    * @param obj
    * @return String representing passed object
    */
   static public String toString(Object obj) {
      StringBuilder builder = new StringBuilder();
      builder.append(obj.getClass().getSimpleName()+ "\n");

      for (Field field : obj.getClass().getDeclaredFields()) {
         int modCode = field.getModifiers();
         field.setAccessible(true);
         try {
            Object value = field.get(obj);
            String modifier = Modifier.toString(modCode);
            String type = field.getType().getSimpleName().toString();
            String name = field.getName().toString();
            builder.append(modifier + " " + type + " " + name + "=" + value + "\n");
         } catch (IllegalAccessException ex) {
            System.err.println(ex.toString());
         }
      }
      return builder.toString();
   }

}
