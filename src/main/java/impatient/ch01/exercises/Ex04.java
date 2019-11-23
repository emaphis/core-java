
package impatient.ch01.exercises;

/**
 * Write a program that prints the smallest and largest positive double values.
 * Hint: Look up Math.nextUp in the Java API.
 * @author emaphis
 */
public class Ex04 {
   public static void main(String[] args) {
      double d = Math.nextUp(0);
      double e = Math.nextDown(Double.POSITIVE_INFINITY);
      System.out.println(d + " : " + e);
   }
}
