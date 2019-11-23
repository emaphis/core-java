/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impatient.ch01.exercises;

import java.util.Scanner;

/**
 * Write a program that reads in two integers between 0 and 4294967295,
 * stores them in int variables, and computes and displays their unsigned
 * sum, difference, product, quotient, and remainder. Do not convert them
 * to long values
 * @author emaphis
 */
public class Ex07 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter two integers between 0 and 4294967396 : ");
      int num1 = Integer.parseUnsignedInt(in.next());
      int num2 = Integer.parseUnsignedInt(in.next());
      System.out.println("Unsigned sum:  " + Integer.toUnsignedString(num1 + num2));
      System.out.println("Unsigned diff: " + Integer.toUnsignedString(num1 - num2));
      System.out.println("Unsigned prod: " + Integer.toUnsignedString(num2 * num2));
      System.out.println("Unsigned qout: " + Integer.divideUnsigned(num2, num2));
      System.out.println("Unsigned rem:  " + Integer.remainderUnsigned(num2, num2));
      in.close();
   }
}
