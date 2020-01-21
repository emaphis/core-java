/*
 * Chapter 4  Inheritance and Reflection
 * Exercises 10
 */
package impatient.ch04.exercises;

import impatient.ch04.sec05.MethodPrinter;

/*
Use the MethodPrinter program in Section 4.5.1, “Enumerating Class Members”
(page 168) to enumerate all methods of the int[] class. Extra credit if you
can identify the one method (discussed in this chapter) that is wrongly
described.
*/

/**
 * @author emaphis
 */
public class Ex10 {

   public static void main(String[] args) {
      int[] array = new int[3];
   //   System.out.println("...." + array.getClass().getCanonicalName());
      //String className = "int[]";
      MethodPrinter.printMethod(array.getClass());
   }
}
