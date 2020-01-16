/*
 * Exercises Chapter 2
 * Ex04.java
 */
package impatient.ch02.exercises;

import javax.xml.rpc.holders.IntHolder;

/**
 * Why can’t you implement a Java method that swaps the contents of
 * two int variables? Instead, write a method that swaps the contents of two
 * IntHolder objects. (Look up this rather obscure class in the API
 * documentation.) Can you swap the contents of two Integer objects?
 * @author emaphis
 */
public class Ex04 {

   private static void swap(IntHolder a, IntHolder b) {
      int temp = a.value;
      a.value = b.value;
      b.value = temp;
   }

   private static void swap(Integer a, Integer b) {
      int temp = a.intValue();
      a = new Integer(b.intValue());
      b = new Integer(temp);

   }

   public static void main(String[] args) {
      Integer i1 = 12;
      Integer i2 = 21;
      swap(i1, i2);
      System.out.println(i1 + " : " + i2);

      IntHolder holder1 = new IntHolder(21);
      IntHolder holder2 = new IntHolder(12);
      IntHolder temp = new IntHolder();
      swap(holder1, holder2);
      System.out.println(holder1.value + " : " + holder2.value);
   }
}
