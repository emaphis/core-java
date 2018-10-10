/*
 * Chapter 9 Collections
 * Exercises 3
 */
package vol1.chap09.exercises;

import java.util.*;

/**
 * Implement union, intersection, difference
 * @author emaphis
 */
public class TestSets {

   public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
      Set<E> newSet = new HashSet<>(set1);
      newSet.addAll(set2);
      return newSet;
   }

   public static <E> Set<E> intersection(Set<E> set1, Set<E> set2) {
      Set<E> newSet = new HashSet<>(set1);
      newSet.retainAll(set2);
      return newSet;
   }

   public static <E> Set<E> difference(Set<E> set1, Set<E> set2) {
      Set<E> newSet = new HashSet<>(set1);
      newSet.removeAll(set2);
      return newSet;
   }

   public static void main(String[] args) {
      Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
      Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
      System.out.println(union(set1, set2));
      System.out.println(intersection(set1, set2));
      System.out.println(difference(set1, set2));
   }
}
