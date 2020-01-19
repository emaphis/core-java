
package impatient.ch03.exercises;

/*
Implement methods

  public static void runTogether(Runnable... tasks)
  public static void runInOrder(Runnable... tasks)

The first method should run each task in a separate thread and then return.
The second method should run all methods in the current thread
and return when the last one has completed.
*/


/**
 * @author emaphis
 */
public class Ex10 {

   public static void main(String[] args) {
      //runTogether(new Greeter(15, "A"), new Greeter(12, "B"), new Greeter(10, "C"));
      runInOrder(new Greeter(15, "A"), new Greeter(12, "B"), new Greeter(10, "C"));
   }

   public static void runTogether(Runnable... tasks) {
      for (Runnable task : tasks) {
         Thread thread = new Thread(task);
         thread.start();
      }
   }

   public static void runInOrder(Runnable... tasks) {
      for (Runnable task : tasks) {
         task.run();
      }
   }

}
