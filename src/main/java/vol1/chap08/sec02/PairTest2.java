/*
 * Chapter 2 - Generics
 * Section - Type bounds
 */
package vol1.chap08.sec02;

import java.time.*;

/**
 *
 * @author emaphis
 */
public class PairTest2 {
   public static void main(String[] args) {
      LocalDate[] birthdays = {
        LocalDate.of(1906, 12, 9),   // G. Hopper
        LocalDate.of(1815, 12, 10),  // A. Lovelace  
        LocalDate.of(1903, 12, 3),   // J. von Nuemann
        LocalDate.of(1910, 6, 22)    // K. Zuse
      };

      Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);

   }
}
