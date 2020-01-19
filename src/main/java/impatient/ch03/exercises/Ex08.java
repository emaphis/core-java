/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;

import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
comp) that keeps calling Collections.shuffle on the array list until the elements
are in increasing order, as determined by the comparator.
*/


public class Ex08 {

   public static void main(String[] args) {
      List<String> strings = Arrays.asList("dd", "ff", "gg", "ee", "bb", "aa", "ff", "cc");
      luckySort(strings, (string1, string2) -> string1.compareTo(string2));
      System.out.println(strings);
   }

   public static void luckySort(List<String> strings, Comparator<String> comp) {
      while (!isSorted(strings, comp)) {
         Collections.shuffle(strings);
      }
   }

   // see: <https://stackoverflow.com/questions/3047051/how-to-determine-if-a-list-is-sorted-in-java>
   private static boolean isSorted(List<String> strings, Comparator<String> comp) {
      String prev = strings.get(0);
      for (String elem : strings) {
         if (prev != null && comp.compare(prev, elem) > 0) {
            return false;
         }
         prev = elem;
      }
      return true;
   }
}
