/*
 * Chapter 3 Intefaces and Lambda Expresions
 * Sec 1 Interfaces
 * Implemeting an Interface
 * DigitSequece.java
 */
package impatient.ch03.sec01;

/**
 * Yields a finite sequence, namely the digits of a positive integer
 * starting with the least significant one
 * @author emaphis
 */
public class DigitSequence implements IntSequence {
   private int number;

   public DigitSequence(int n) {
      number = n;
   }

   @Override
   public boolean hasNext() {
      return number != 0;
   }

   @Override
   public int next() {
      int result = number % 10;
      number /= 10;
      return result;
   }

   public int rest() {
      return number;
   }

}
