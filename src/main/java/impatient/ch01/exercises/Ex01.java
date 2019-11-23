/*
 * Exercises 01
 */
package impatient.ch01.exercises;

import java.util.Scanner;

/**
 * Exercise 1.1
 * Write a program that reads an integer and prints it in binary, octal, and
 * hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
 * @author emaphis
 */
public class Ex01 {
   public static void main(String[] args) {
      System.out.println("Enter a number to convert:");
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      System.out.printf("Binary: %s\n", Integer.toBinaryString(num));
      System.out.printf("Octal: %o\n", num);
      System.out.printf("Hex: %x\n", num);
      System.out.printf("Hex floating point %a\n", 1.0 / num);
      in.close();
   }
}
