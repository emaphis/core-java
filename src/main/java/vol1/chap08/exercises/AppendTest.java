/*
 * Chapter 8 - Generics
 * Exercise 6
 */
package vol1.chap08.exercises;

import java.util.ArrayList;

/**
 * Define and test append.
 * @author emaphis
 */
public class AppendTest {
   public static <E> void append1(ArrayList<E> a, ArrayList<? extends E> b) {
      a.addAll(b);
   }

   public static <E> void append2(ArrayList<? super E> a, ArrayList<E> b) {
      a.addAll(b);
   }

   static class A {
      private final String id; 
      public A(String id) { this.id = id; }
      public String getId() { return id; }
   }
   
   static class B extends A {
      public B(String id) { super(id); } 
   }

   public static void main(String[] args) {
       ArrayList<A> arrA = new ArrayList<>();
       arrA.add(new A("a1"));
       arrA.add(new A("a2"));
       arrA.add(new A("a3"));
  
       ArrayList<B> arrB = new ArrayList<>();
       arrB.add(new B("b1"));
       arrB.add(new B("b2"));
       arrB.add(new B("b3"));
       
       //append1(arrA, arrB);  // good
       //append1(arrB, arrA);  // type error 

       //append2(arrA, arrB); // good
       //append2(arrB, arrA); // type error
   }
}
