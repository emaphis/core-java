/*
 * Generics
 * Exercises 9,10,11
 */
package vol1.chap08.exercises;

import java.util.ArrayList;

/**
 * Array algorithms.
 * @author emaphis
 */
public class Arrays {
   // Exercise 9
   public static <E extends Comparable<E>> Pair<E>
       firstLast(ArrayList<? extends Comparable<E>> a) {
      return new Pair(a.get(0), a.get(a.size() - 1));
   }

   // Exercise 10

}
