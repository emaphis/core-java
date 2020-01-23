/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Sec 1  Exception Handling
 *   1.1  Throwing Exceptions
 */
package impatient.ch05.sec01;

/**
 *
 * @author emaphis
 */
public class ThrowDemo {

   public static int randInt(int low, int high) {
      if (low > high)
         throw new IllegalArgumentException(
            "low should be <= high but low is "
            + low + " and high is " + high);

      return low + (int) (Math.random() * (high - low + 1));
   }

   public static void main(String[] args) {
      System.out.println("Generating  random number...");
      int r = randInt(10, 20);
      System.out.println("r = " + r);
      System.out.println("And another...");
      r = randInt(10, 5);
      System.out.println("r = " + r);
   }
}
