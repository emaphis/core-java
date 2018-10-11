/*
 * Chapter 9 Collections
 * Section Iterable Interface
 */
package vol1.chap09.iterable;

/**
 * Test the Counter class
 * @author emaphis
 */
public class TestCounter {
   public static void main(String[] args) {
      int total = 0;
      Counter counter = new Counter(5);
      for (Integer i : counter) {
         total += i;
      }

      System.out.println("total = " + total);
   }
}
