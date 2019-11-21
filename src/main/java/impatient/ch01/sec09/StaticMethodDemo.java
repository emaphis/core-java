/*
 * StaticMethodDemo.java
 * 1.9 Functional decompositiom
 */
package impatient.ch01.sec09;

import java.util.Scanner;

/**
 * Demo of static method
 * @author emaphis
 */
public class StaticMethodDemo {
   public static double averge(double x, double y) {
      double sum = x + y;
      return sum / 2;
   }

   public static void main(String[] args) {
      System.out.println("Enter tow numbers: ");
      Scanner in = new Scanner(System.in);
      double a = in.nextDouble();
      double b = in.nextDouble();
      double result = averge(b, b);
      System.out.println("Average: " + result);
      in.close();
   }
}
