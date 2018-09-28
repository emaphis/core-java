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
   public interface UnaryPredicate<T> {
      public boolean test(T obj);
   }

   public static <T> int count(Collection<T> coll, UnaryPredicate<T> p) {
      int count = 0;
      for (T t : coll) {
         if (p.test(t)) count++;
      }
      return count;
   }

   static class OddPred implements UnaryPredicate<Integer> {
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

   /**
    * Exercise 2
    * Return the maximum of two items
    * @param <T> Type of items to compare
    * @param x item 1 to compare
    * @param y item 2 to compare
    * @return maximum item
    */
   public static <T extends Comparable<T>> T max(T x, T y) {
      //return x > y ? x : y; // doesn't compile
      return(x.compareTo(y) > 0) ? x : y;
   }

   /**
    * Exercise 3
    * Exchange two items in a list
    * @param <T> type of Array
    * @param idx1 first item to exchange
    * @param idx2 second item to exchange
    * @param array
    */
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

   /**
    * Exercise 7
    * Yes, compiles
    * Print a List of Numbers
    * @param list List to print
    */
   public static void print(List<? extends Number> list) {
      for (Number n : list)
         System.out.print(n + " ");
      System.out.println();
   }

   public static void testPrint() {
      List<Integer> li = Arrays.asList(1,2,3,4,5);
      print(li);
      List<Double> ld = Arrays.asList(1.0, 2.0, 3.0, 4.0);
      print(ld);
      List<Number> ln = Arrays.asList(1, 2.0, 3, 4.0, 5);
      print(ln);
   }

   /**
    * Exercise 8
    * Find the maximal element in a list (beg, end]
    * @param <T> Type of list
    * @param beg beginning element
    * @param end ending element
    * @param lst the list
    * @return the Maximal element
    */
   public static <T extends Comparable<T>> T maximal(int beg, int end, List<T> lst) {
      T tmp = lst.get(beg);
      for (int i = beg; i < end; i++) {
         T elem = lst.get(i);
         if (elem.compareTo(tmp) > 0)
            tmp = elem;
      }
      return tmp;
   }

   public static void testMaximal() {
      List<Integer> li1 = Arrays.asList(1,2,3,4,5,6,7,8);
      System.out.println("li1: " + (maximal(2, 5, li1) == 5));
      List<Integer> li2 = Arrays.asList(8,7,6,5,4,3,2,1);
      System.out.println("li2: " + (maximal(2, 5, li2) == 6));
      List<String> ls = Arrays.asList("AA", "BB", "CC", "DD", "EE", "FF");
      System.out.println("ls: " + (maximal(2, 5, ls).equals("EE")));
   }


   public static void main(String[] args) {
      System.out.println("Hello world!");
      testCount();
      testExchange();
      testPrint();
      testMaximal();
   }
}
