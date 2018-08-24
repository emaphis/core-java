/*
 * Chapter 6 Interfaces
 * Exercise 8
 */
package vol1.chap06.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Lucky sort shuffles a collection of Ints until they are in sorted order
 * Very inefficient, lol.
 * @author emaphis
 */
public class TestLuckySort {
   static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
      while (!isSorted(strings, comp)) {
         Collections.shuffle(strings);
      }
   }

   static boolean isSorted(ArrayList<String> strings, Comparator<String> comp) {
      for (int i = 0; i <= strings.size(); i++) {
         if (comp.compare(strings.get(i), strings.get(++i)) > 0) {
            return false;
         }
      }
      return true;
   }
}
