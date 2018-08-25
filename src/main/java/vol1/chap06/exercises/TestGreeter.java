/*
 * Chaper 6 - Interfaces
 * Exercise 9
 */
package vol1.chap06.exercises;

/**
 *
 * @author emaphis
 */
public class TestGreeter {
   public static void main(String[] args) {
      Thread greet1 = new Thread(new Greeter(10, "Tom"));
      Thread greet2 = new Thread(new Greeter(10, "Dick"));
      Thread greet3 = new Thread(new Greeter(10, "Harry"));

      greet1.start();
      greet2.start();
      greet3.start();
   }
}
