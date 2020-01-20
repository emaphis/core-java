/*
 * Chapter 4 Inheritance and Reflection
 * Sec 1 Extending a Class
 * Method Expressions with Super
 */
package impatient.ch04.sec01;

/**
 *
 * @author emaphis
 */
public class ConcurrentWorker extends Worker {

   @Override
   public void work() {
      Thread t = new Thread(super::work);
      t.start();
   }

}
