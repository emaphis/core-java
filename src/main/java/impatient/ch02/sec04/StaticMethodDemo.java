/*
 * Chapter 2 Object-Oriented Programming
 * Sec 2.4 Static Variables and Methods
 * StaticMethodDemo.java
 */

package impatient.ch02.sec04;

import java.text.NumberFormat;

/**
 * Factory methods
 * @author emaphis
 */
public class StaticMethodDemo {

   public static void main(String[] args) {
      int dieToss = RandomNumbers.nextInt(1, 6);
      System.out.println("dieToss " + dieToss);

      NumberFormat currencyFormator = NumberFormat.getCurrencyInstance();
      NumberFormat percentFormator = NumberFormat.getPercentInstance();
      double x = 0.1;
      System.out.println("currency: " + currencyFormator.format(x));
      System.out.println("percent: " + percentFormator.format(x));
   }
}
