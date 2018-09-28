/*
 * Chapter 8 Generics
 * Exercise 11
 * Yes, compiles
 */
package vol1.chap08.exercises;

class Node1<T> implements Comparable<T> {
   //T elem;
   @Override
   public int compareTo(T obj) {
      return -1;
   }
}


public class Ex11 {
   static void testNode1() {
      Node1<String> node = new Node1<>();
      Comparable<String> comp = node;  // yes, compiles
   }
}
