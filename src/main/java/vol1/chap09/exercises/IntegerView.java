/*
 * Chapter 9 Collections
 * Exercise 14
 */
package vol1.chap09.exercises;

import java.util.*;

/**
 *
 * @author emaphis
 */
public class IntegerView {
   public static Iterator<Integer> listView(int num) {
      return new Iterator<Integer>() {
         private int current = 0;

         @Override
         public boolean hasNext() {
            return current < num;
         }

         @Override
         public Integer next() {
            return current++;
         }
      };
   }
}
