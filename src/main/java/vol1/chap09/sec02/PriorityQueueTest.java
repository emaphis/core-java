/*
 * Chapter 9 Collections
 * Section 2.5 PriorityQueue.
 */
package vol1.chap09.sec02;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * Test PriorityQueue
 * @author emaphis
 */
public class PriorityQueueTest {
   public static void testQueue() {
      PriorityQueue<LocalDate> pq = new PriorityQueue<>();
      pq.add(LocalDate.of(1906, 12, 9));  // G. Hopper
      pq.add(LocalDate.of(1815, 12, 10));  // A. Lovelace
      pq.add(LocalDate.of(1903, 12, 3));  // J. von Neumann
      pq.add(LocalDate.of(1910, 6, 22));  // K. Zuse

      System.out.println("Iterating over elements...");
      for (LocalDate date : pq) {
         System.out.println(date);
      }
      System.out.println("Removing elements...");
      while (!pq.isEmpty()) {
         System.out.println(pq.remove());
      }
   }

   public static void main(String[] args) {
      testQueue();
   }
}
