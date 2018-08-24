/*
 * Interfaces
 */
package vol1.chap06.sec01;

/**
 * Class that yields a finite sequence of digits of a positive integer
 * starting with the least significant one.
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
