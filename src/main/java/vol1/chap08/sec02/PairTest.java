/*
 * Chapter 8 - Generics
 * Section 2,3,4
 */
package vol1.chap08.sec02;

import java.time.LocalDate;

/**
 * Test generic class Pair
 * @author emaphis
 */
public class PairTest {

   /**
    * Section 2 - A simple generic class
    */
   public static void testSimplePair() {
      String[] words = {"Mary", "had", "a", "little", "lamb"};
      Pair<String> mm = ArrayAlg.minmaxStr(words);
      System.out.println("min= " + mm.getFirst());
      System.out.println("max= " + mm.getSecond());
   }

   /**
    * Section 3 - Generic methods.
    */
   public static void testGenericMethod() {
      String middle1 = ArrayAlg.<String>getMiddle("John", "Q.", "Public");
      String middle2 = ArrayAlg.getMiddle("John", "Q.", "Public");
      double middle3 = ArrayAlg.getMiddle(3, 1729, 0);
      System.out.println("middle1=" + middle1 + ",middle2=" + middle3 + ",middle3=" + middle3);
   }
   
   /**
    * Section 4 - Bounds for type variables
    */
    public static void testBoundedTypeVariables() {
      LocalDate[] birthdays = {
        LocalDate.of(1906, 12, 9),   // G. Hopper
        LocalDate.of(1815, 12, 10),  // A. Lovelace  
        LocalDate.of(1903, 12, 3),   // J. von Nuemann
        LocalDate.of(1910, 6, 22)    // K. Zuse
      };
      Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
      System.out.println("min = " + mm.getFirst() + " , max = " + mm.getSecond());
   }

    public static void main(String[] args) {
      testSimplePair();
      testGenericMethod();
      testBoundedTypeVariables();
   }
}
