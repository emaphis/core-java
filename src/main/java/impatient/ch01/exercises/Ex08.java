/*
 * Exercises.
 * Ex08.java
 */
package impatient.ch01.exercises;

import java.util.Scanner;

/**
 * Write a parogram that reads a string and prints all of its nonempty
 * substrings.
 * @author emaphis
 */
public class Ex08 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Read in a string: ");
      String str = in.next();
      for (int i = 0; i <= str.length(); i++) {
         // skip whitespace.
         if (str.length() > 0 && !Character.isWhitespace(str.charAt(i))) {
            for (int j = i+1; j <= str.length(); j++) {
               if (!Character.isWhitespace(str.charAt(j-i-1))) {
                  String substr = str.substring(i, j);
                  System.out.println(substr);
               }
            }
         }
      }
   }
}
