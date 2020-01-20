/*
 * Chapter 4 Inheritance and Reflection
 * Sec 3 Enumerations
 * Methods of Enumerations
 */
package impatient.ch04.sec03;

import java.util.Arrays;


/**
 *
 * @author emaphis
 */
public class EnumDemo {

   public static void main(String[] args) {
      demoSize();
   }

   static void demoSize() {
      Size notMySize = Size.valueOf("SMALL");
      Size mySize = Size.LARGE;
      System.out.println("size: " + notMySize + " : " + mySize);

      Size[] allValues = Size.values();
      System.out.println(Arrays.toString(allValues));

      for (Size value : Size.values()) {
         System.out.println("Size: " + value);
      }

      // position of value
      System.out.println("Medium: " + Size.MEDIUM.ordinal());
   }
}
