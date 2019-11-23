/*
 * Exercises chap 01
 * Ex11.java
 */
package impatient.ch01.exercises;

import java.util.Scanner;

/**
 * Write a program that reads a line of text and prints all characters that
 * are not ASCII, together with their Unicode values.
 * See page 32.
 * @author emaphis
 */
public class Ex11 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      in.close();
      int[] codePoints = str.codePoints().toArray();
      for (int codePoint : codePoints) {
         if (codePoint > 127) {
            System.out.printf("%c : %X\n", (char)codePoint, codePoint);
         }
      }
   }
}
