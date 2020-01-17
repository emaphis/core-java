/*
 * Exercises - Chaper 2
 * Ex16.java
 */
package impatient.ch02.exercises;

/*
Implement a class Queue, an unbounded queue of strings. Provide methods
add, adding at the tail, and remove, removing at the head of the queue.
Store elements as a linked list of nodes. Make Node a nested class. Should
it be static or not?
*/

/**
 *
 * @author emaphis
 */
class Queue {

   private class Node {
      private String item;
      private Node next;

      private Node(String item) {
         this.item = item;
         next = null;
      }

      protected String getItem() { return item; }
   }

   private Node head;
   private Node tail;

   /**
    * Add a String item to tail of queue.
    * @param item added to head of queue.
    */
   public void add(String item) {
      //Node oldTail = tail;
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

   public void printQueue() {
      Node node = head;
      while (node != null) {
         System.out.println(node.item);
         node = node.next;
      }
   }
}

public class Ex16 {

   public static void main(String[] args) {
      Queue queue = new Queue();
      queue.add("aaa");
      queue.add("bbb");
      queue.add("ccc");
      queue.add("ddd");
      queue.add("eee");
      queue.printQueue();
      System.out.println("now remove two items ****");
      String item1 = queue.remove();
      String item2 = queue.remove();
      System.out.println("Removed items: " + item1 + "; " + item2);
      queue.printQueue();
   }
}
