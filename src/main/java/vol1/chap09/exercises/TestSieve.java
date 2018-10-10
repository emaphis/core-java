/*
 * Chapter 9 Collections
 * Exercise 1
 */
package vol1.chap09.exercises;

import java.util.*;

/**
 *
 * @author emaphis
 */
public class TestSieve {

   static void testHashSet(int n) {
      // load hashset
      Set<Integer> hs = new HashSet<>();
      for (int i = 2; i <= n; i++) {
         hs.add(i);
      }

      // run sieve
      for (int s = 2; s*s < n; s++) {
         for (int i = 0; i < hs.size(); i++) {
            if (hs.contains(s * (s + i))) {
               hs.remove(s * (s + i));
            }
         }
      }

      System.out.println(hs);
   }


   static void testBitSet(int n) {
      // load hashset
      BitSet bs = new BitSet(n);
      bs.set(0, false);
      for (int i = 2; i <= n; i++) {
         bs.set(i);
      }

      // run sieve
      for (int s = 2; s*s < n; s++) {
         for (int i = 0; i < n; i++) {
            if (bs.get(s * (s + i))) {
               bs.set(s * (s + i), false);
            }
         }
      }

      for (int i = 2; i <= n; i++) {
         if (bs.get(i))
            System.out.print(i + ", ");
      }
   }


   public static void main(String[] args) {
      testHashSet(100);
      testBitSet(100);
   }

}
