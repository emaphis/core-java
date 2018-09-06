/*
 * Chapter 8 Generics
 * Sec 8 - Wildcards
 */
package vol1.chap08.sec05;

import vol1.chap08.sec02.Pair;

/**
 *
 * @author emaphis
 */
public class PairAlg {
   public static boolean hasNulls(Pair<?> p) {
      return p.getFirst() == null || p.getSecond() == null;
   }

   public static void swap(Pair<?> p) { swapHelper(p); }

   public static <T> void swapHelper(Pair<T> p) {
      T t = p.getFirst();
      p.setFirst(p.getSecond());
      p.setSecond(t);
   }
}
