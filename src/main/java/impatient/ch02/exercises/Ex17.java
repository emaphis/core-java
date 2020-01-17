/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impatient.ch02.exercises;

/**
 *
 * @author emaphis
 */
class Queue2 {

   private class Node {
      private final String item;
      private Node next;

      Node(String item) {
         this.item = item;
         next = null;
      }

      String getItem() { return item; }
   }

   public class Iterator {
      Node node = head;

      public String next() {
         if (node == null) return null;
         String item = node.item;
         node = node.next;

         return item;
      }

      public boolean hasNext() {
         return node != null;
      }

   } // end Iterator.

   private Node head = null;
   private Node tail = null;

   /**
    * Add a String item to tail of queue.
    * @param item added to head of queue.
    */
   public void add(String item) {
      Node node = new Node(item);
      if (head == null) {
         head = node;
         tail = node;
      } else {
         tail.next = node;
         tail = node;
      }

   }

   /**
    * Remove item from queue's head.
    */
   public String remove() {
      if (head == null) return null;
      String item = head.item;
      head = head.next;
      return item;
   }

   public Iterator iterator() {
      return new Iterator();
   }

}

public class Ex17 {

   static void printQueue(Queue2 queue) {
      Queue2.Iterator iter = queue.iterator();
      while (iter.hasNext()) {
         String item = iter.next();
         System.out.println(item);
      }
   }

   public static void main(String[] args) {

      Queue2 queue = new Queue2();
      queue.add("aaa");
      queue.add("bbb");
      queue.add("ccc");
      queue.add("ddd");
      queue.add("eee");
      printQueue(queue);
      System.out.println("now remove two items ****");
      String item1 = queue.remove();
      String item2 = queue.remove();
      System.out.println("Removed items: " + item1 + "; " + item2);
      printQueue(queue);
   }
}
