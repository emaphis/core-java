/*
 * Chapter 5 Inheritance
 * Section 6 Enums
 * Test Enumerations
 */
package vol1.chap05.sec06;

import java.util.Scanner;

/**
 * Test Size Enum
 * @author emaphis
 */
public class EnumTest {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
      String input = in.next().toUpperCase();
      Size size = Enum.valueOf(Size.class, input);
      System.out.println("size=" + size);
      System.out.println("abbreviation=" + size.getAbbreviation());
      if (size == Size.EXTRA_LARGE)
         System.out.println("Good job--you paid attention to the _.");
   }
}
