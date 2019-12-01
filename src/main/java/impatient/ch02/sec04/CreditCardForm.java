/*
 * Chapter 2 Object-Oriented Programming
 * 2.4 Static Variables and Methods
 * CreditCardForm.java
 */
package impatient.ch02.sec04;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Static Initialization Blocks
 * @author emaphis
 */
public class CreditCardForm {
   private static final ArrayList<Integer> expirationYear = new ArrayList<>();

   static {
      // Add the next twenty years to the array list
      int year = LocalDate.now().getYear();
      for (int i = year; i <= year + 20; i++) {
         expirationYear.add(i);
      }
   }

}
