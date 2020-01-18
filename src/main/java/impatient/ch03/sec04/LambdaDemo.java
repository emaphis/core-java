/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 4 Lambda Expressions
 * The Syntax of Lambda Expressions
 */
package impatient.ch03.sec04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;

/**
 *
 * @author emaphis
 */
public class LambdaDemo {

   public static void main(String[] args) {
      // a lambda for a Comparator.
      Comparator<String> comp1 = (String first, String second) -> first.length() - second.length();

      Comparator<String> comp2 = (String first, String second) -> {
         int difference =first.length() - second.length();
         if (difference < 0) return -1;
         else if (difference > 0) return 1;
         else return 0;
      };

      // Functional Intefaces.

      String[] friends1 = { "Peter", "Paul", "Mary" };
      Arrays.sort(friends1, (first, second) -> first.length() - second.length());
      System.out.println(Arrays.toString(friends1));

      String[] friends2 = { "Peter", "Paul", "Mary" };
      Arrays.sort(friends2, comp1);
      System.out.println(Arrays.toString(friends2));

      ArrayList<String> enemies =
            new ArrayList<>(Arrays.asList("Malfoy", "Cravve", "Golyle", null));
      enemies.removeIf(e -> e == null);
      System.out.println(enemies);
   }
}
