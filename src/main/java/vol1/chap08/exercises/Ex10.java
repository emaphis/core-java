/*
 * Chapter 8 Generics
 * Exercise 10
 * No, doesn't compile
 */
package vol1.chap08.exercises;

class Shape { /* ... */ }
class Circle extends Shape { /* ... */ }
class Rectangle extends Shape { /* ... */ }

class Node<T> { /* ... */ }


public class Ex10 {
   public static void testNode() {
      Node<Circle> nc = new Node<>();
      // Node<Shape> ns1 = nc;  // doesn't compile
      Node<? extends Shape> ns2 = nc;
   }

}
