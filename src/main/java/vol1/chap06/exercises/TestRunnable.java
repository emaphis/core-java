/*
 * Chapter 6 - Interfaces
 * Excercise 10
 */
package vol1.chap06.exercises;

/**
 *
 * @author emaphis
 */
public class TestRunnable {
   public static void runTogether(Runnable... tasks) {
      for (Runnable task : tasks) {
         Thread runner = new Thread(task);
         runner.start();
      }
   }

   public static void runInOrder(Runnable... tasks) {
      for (Runnable task : tasks) {
         task.run();
      }
   }

   public static void main(String[] args) {
      //runTogether(new Greeter(10, "Tom"), new Greeter(10, "Dick"), new Greeter(10, "Harry"));
      runInOrder(new Greeter(10, "Tom"), new Greeter(10, "Dick"), new Greeter(10, "Harry"));
   }
}
