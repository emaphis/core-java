/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercise 9
 */
package impatient.ch03.exercises;


/*
 Implement a class Greeter that implements Runnable and whose run method
prints n copies of "Hello, " + target, where n and target are set in the constructor.
Construct two instances with different messages and execute
them concurrently in two threads
 */

/** *
 * @author emaphis
 */
public class Ex09 {

   public static void main(String[] args) {
      Thread aThread = new Thread(new Greeter(15, "Alpha"));
      Thread bThread = new Thread(new Greeter(10, "Beta"));

      aThread.start();
      bThread.start();
  }
}
