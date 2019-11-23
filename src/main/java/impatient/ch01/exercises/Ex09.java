/*
 * Exercises
 * Ex09.java
 */
package impatient.ch01.exercises;

/**
 * Section 1.5.3, “String Comparison” (page 25) has an example of two strings
 * s and t so that s.equals(t) but s != t. Come up with a different example
 * that doesn’t use substring).
 * @author emaphis
 */
public class Ex09 {
   public static void main(String[] args) {
      String str1 = "Hello";
      String str2 = new StringBuffer(str1).reverse().reverse().toString();

      System.out.println(str1 == str2);
      System.out.println(str1.equals(str2));
   }
}
