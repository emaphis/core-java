
package impatient.ch01.exercises;

import java.util.Scanner;

/**
 * Exercise 3.1
 * Using only the conditional operator, write a program that reads three
 * integers and prints the largest. Repeat with Math.max
 * @author emaphis
 */
public class Ex03 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();
      int max1 = x > y ? x : (y > z ? y : z);
      int max2 = Math.max(Math.max(x, y), z);
      System.out.println("max: " + max1 + ", " + max2);
   }
}
