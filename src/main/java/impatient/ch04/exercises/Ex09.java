/*
 * Chapter 4  Inheritance and Reflection
 * Exercises
 */
package impatient.ch04.exercises;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;

/*
Write a “universal” toString method that uses reflection to yield a string
with all instance variables of an object. Extra credit if you can handle
cyclic references.
*/

class ExampleClass {
   public int num;
   private String str;
   protected int[] array;
   private InnerClass inner;

   public ExampleClass(int i, String str) {
      this.num = i;
      this.str = str;
      this.array = new int[i];
      this.inner = new InnerClass(i);
   }

   public class InnerClass {
      private int i;
      public InnerClass(int i) { this.i = i; }
      public int geI() { return i; }
   }
}

/**
 * @author emaphis
 */
public class Ex09 {

   public static void main(String[] args) {
      ExampleClass some = new ExampleClass(5, "Hello");
      String out = ClassUtils.toString(some);
      System.out.println(out);
   }

}
