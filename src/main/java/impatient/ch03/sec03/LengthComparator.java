/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 3 The Example of Interfaces
 * Implemeting an Interface
 * LengthComparator.java
 */
package impatient.ch03.sec03;

import java.util.Comparator;

/**
 *
 * @author emaphis
 */
public class LengthComparator implements Comparator<String> {

   @Override
   public int compare(String first, String second) {
      return first.length() - second.length();
   }

}
