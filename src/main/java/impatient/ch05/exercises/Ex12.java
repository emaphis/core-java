/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exercise 12
 */
package impatient.ch05.exercises;

import java.util.Objects;

/*
Compare the use of Objects.requireNonNull(obj) and assert obj != null. Give a
compelling use for each.
*/

/**
 * @author emaphis
 */
public class Ex12 {

   public static void main(String[] args) {
      Object obj = null;
      Objects.requireNonNull(obj, "Opps! 'obj' is null!");

      //assert obj != null;
   }
}
