/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impatient.ch02.sec04;

import java.text.NumberFormat;

/**
 *
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
