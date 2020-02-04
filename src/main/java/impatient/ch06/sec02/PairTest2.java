/*
 * Chapter 6  Generic Programming
 * Sec 2  Generic methods.
 *
 */
package impatient.ch06.sec02;

import impatient.ch06.sec01.Pair;
import java.time.LocalDate;

/**
 *
 * @author emaphis
 */
public class PairTest2 {

   public static void main(String[] args) {
      LocalDate[] birthdays = {
         LocalDate.of(1906, 12, 9),  // G. Hopper
         LocalDate.of(1815, 12, 10),  // A Lovelace
         LocalDate.of(1903, 2, 3),    // J. von Neuman
         LocalDate.of(1910, 6, 22),   // K. Zuse
      };
      Pair<LocalDate> mm = ArrayAlg2.minmax(birthdays);
      System.out.println("min = " + mm.getFirst());
      System.out.println("max = " + mm.getSecond());

      String middle = ArrayAlg2.getMiddle("John", "Q.", "Public");
      System.out.println(middle);
      double middle2 = ArrayAlg2.getMiddle(3.12, 1729.0, 0.0);
      System.out.println(middle2);
   }
}
