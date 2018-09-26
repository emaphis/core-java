/*
 * Chapter 8 Generics
 * Section vol1.chap08.exercises
 */
package vol1.chap08.exercises;

import java.util.Collection;
import java.util.function.*;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class Exercises {

   // Exercise 1
   public static <T> int count(Collection<T> coll, Predicate<T> p) {
      int count = 0;
      for (T t : coll) {
         if (p.test(t)) count++;
      }
      return count;
   }

   static class OddPred implements Predicate<Integer> {
      @Override
      public boolean test(Integer i) {
         return i % 2 != 0;
      }
   }

   static void testCount() {
      Collection<Integer> ci = Arrays.asList(1,2,3,4,5,6,7);
      int oddCount = count(ci, new OddPred());
      System.out.println("Odd count: " + oddCount);
      int evenCount = count(ci, i -> i%2 == 0);
      System.out.println("Even count: " + evenCount);
   }

   //Exercise 2
   public static <T extends Comparable<T>> T max(T x, T y) {
      return(x.compareTo(y) > 0) ? x : y;
   }

   // Exercise 3
   public static <T> void exchange(int idx1, int idx2, T[] array) {
      T temp = array[idx1];
      array[idx1] = array[idx2];
      array[idx2] = temp;
   }

   public static void testExchange() {
      Integer[] iarray = new Integer[] { 1, 2, 3, 4, 5 };
      exchange(2, 4, iarray);
      System.out.println("int array: " + Arrays.toString(iarray));
   }

   // Exercise 7
   public static void print(List<? extends Number> list) {
      for (Number n : list)
         System.out.print(n + "");
      System.out.println();
   }

   public static void main(String[] args) {
      System.out.println("Hello world!");
      testCount();
      testExchange();
   }
}
