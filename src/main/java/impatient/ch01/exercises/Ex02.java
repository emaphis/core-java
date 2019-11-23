/*
 * Exerchises chaper 1
 * Ex02.java
 */
package impatient.ch01.exercises;

import java.util.Scanner;

/**
 * Exercise 1.2
 * Write a program that reads an integer angle (which may be positive or
 * negative) and normalizes it to a value between 0 and 359 degrees. Try
 * it first with the % operator, then with floorMod.
 * @author emaphis
 */
public class Ex02 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the number of degrees to normalize: ");
      int degrees = in.nextInt();
      System.out.println("normalized: " + degrees % 360);
      System.out.println("normalized: " + Math.floorMod(degrees, 360));
      in.close();
   }
}
