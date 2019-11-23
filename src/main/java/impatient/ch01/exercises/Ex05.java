/*
 * Exercises
 * Ex05.java
 */
package impatient.ch01.exercises;

/**
 * What happens when you cast a double to an int that is larger than the
 * largest possible int value? Try it out.
 * @author emaphis
 */
public class Ex05 {
   public static void main(String[] args) {
      double num = (double) Integer.MAX_VALUE  + 1.0;
      System.out.println("large number: " + num);
   }
}
