/*
 * Chapter 9 Collections
 * Exercise 5
 */
package vol1.chap09.exercises;

import java.util.*;

/**
 *
 * @author emaphis
 */
public class TestSwap {

   public static void swap(List<?> list, int i, int j) {
      if (list instanceof RandomAccess)
         swapRandomAccess(list, i, j);
      else
         Collections.swap(list, i, j);
   }

   static <E> void swapRandomAccess(List<E> list, int i, int j) {
      //System.out.println("random access");
      E temp = list.get(i);
      list.set(i, list.get(j));
      list.set(j, temp);
   }

   public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
      swap(al, 1, 3);
      System.out.println("Array List: " + al.toString());

      LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4,5));
      swap(ll, 1, 3);
      System.out.println("Linked List: " + ll.toString());
   }
}
