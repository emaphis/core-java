/*
 * Chapter 8 - Generics
 * Exercise 1,2 test
 */
package vol1.chap08.exercises;

/**
 * Test the Stack class
 * @author emaphis
 */
public class StackTest {
   public static void testStack() {
      System.out.println("Test stack intitialized with String");
      Stack<String> stringStk = new Stack<>(10);
      stringStk.push("A");
      stringStk.push("B");
      stringStk.push("C");
      // print string stack
      while (!stringStk.isEmpty()) {
         String str = stringStk.pop();
         System.out.println("Item= " + str);
      }
   }

   public static void testEArrayStack() {
      System.out.println("Test EArrayStack with String");
      EArrayStack<String> eaStk = new EArrayStack<>(2); // tiny stack
      eaStk.push("A");
      eaStk.push("B");
      eaStk.push("C");  // should expand stack
      eaStk.push("D");
      while (!eaStk.isEmpy()) {
         String item = eaStk.pop();
         System.out.println("Item= " + item);
      }
      try {
         String item = eaStk.pop();
         System.out.println("Item= " + item); // never get here.
      } catch (IllegalStateException e) {
         System.out.println(e.getMessage());
      }
   }
      

   public static void testOStack() {
      System.out.println("Test OStack with String");
      OStack<String> OStk = new OStack<>(2); // tiny stack
      OStk.push("A");
      OStk.push("B");
      OStk.push("C");  // should expand stack
      OStk.push("D");
      while (!OStk.isEmpty()) {
         String item = OStk.pop();
         System.out.println("Item= " + item);
      }
      try {
         String item = OStk.pop();
         System.out.println("Item= " + item); // never get here.
      } catch (IllegalStateException e) {
         System.out.println(e.getMessage());
      }
   }
   public static void main(String[] args) {
      testStack();
      testEArrayStack();
      testOStack();
   }
}
