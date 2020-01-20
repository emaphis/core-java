/*
 * Chapter 4 Inheritance and Reflection
 * Sec 1 Extending a Class
 * Method Expressions with Super
 */
package impatient.ch04.sec01;

/**
 * @author emaphis
 */
public class WorkerDemo {

   public static void main(String[] args) {
      ConcurrentWorker worker = new ConcurrentWorker();
      worker.work();
      System.out.println("Done");
   }
}
