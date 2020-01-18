/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 3 The Example of Interfaces
 * Demo code
 */
package impatient.ch03.sec03;

import java.util.Arrays;

/**
 * Demoing sec 3 code
 * @author emaphis
 */
public class CodeDemo {

   static void sortDemo() {
      String[] group = { "Peter", "Paul", "Mary"};
      Arrays.sort(group);  // Default sort.
      System.out.println(Arrays.toString(group));

      group = new String[] { "Peter", "Paul", "Mary"};
      Arrays.sort(group, new LengthComparator());
      System.out.println(Arrays.toString(group));
   }

   static void runnableDemo() {
      Runnable task = new HelloTask();
      Thread thread = new Thread(task);
      thread.start();
   }

   public static void main(String[] args) {
      sortDemo();
      runnableDemo();
   }

}
