/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exercise 9
 */
package impatient.ch05.exercises;

import java.util.concurrent.locks.ReentrantLock;

/*
Design a helper method so that one can use a ReentrantLock in a try-withresources
statement. Call lock and return an AutoCloseable whose close method
calls unlock and throws no exceptions
*/

/**
 * @author emaphis
 */
public class Ex09 {

   static class WrapLock extends ReentrantLock implements AutoCloseable {

      // can remove Exception, since reentrent unlock doesnt throw exceptions
      @Override
      public void close() {
         System.out.println("Unlock....");
         this.unlock();
      }

   }

   static WrapLock callLock() {
      WrapLock reentrant = new WrapLock();
      reentrant.lock();
      System.out.println("Lock...");
      return reentrant;
   }

   public static void main(String[] args) {
      try (WrapLock myLock = callLock()) {
         // use lock
      }
   }
}
