/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 8 Higher-Order Functions
 * Methods that Return Functions
 */
package impatient.ch03.sec08;

import java.util.Comparator;
import java.util.Arrays;

/**
 *
 * @author emaphis
 */
public class FunctionReturnDemo {

   public static void main(String[] args) {
      String[] words = { "Mary", "had", "a", "little", "lamb" };
      Arrays.sort(words, compareInDirection(-1)); // return a comparator.
      System.out.println(Arrays.toString(words));

      Arrays.sort(words, reverse(String::compareToIgnoreCase));
      System.out.println(Arrays.toString(words));
   }

   // return a function
   public static Comparator<String> compareInDirection(int direction) {
      return (x, y) -> direction * x.compareTo(y);
   }
   // compareInDirection(-1);  // assending comparator.
   // compareInDirection(1)    // descending.

   // Methods that Modify Functions
   public static Comparator<String> reverse(Comparator<String> comp) {
      return (x, y) -> -comp.compare(x, y);
   }
}
