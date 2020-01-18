/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 3 The Example of Interfaces
 * The Runnable Interface
 */
package impatient.ch03.sec03;

/**
 *
 * @author emaphis
 */
public class HelloTask implements Runnable{

   @Override
   public void run() {
      for (int i = 0; i < 10; i++) {
         System.out.println("Hello, World!");
      }
   }
}
