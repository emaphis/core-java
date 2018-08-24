/*S
 * Chapter 6 Interfaces
 * Exercise 6
 */
package vol1.chap06.exercises;

import java.math.BigInteger;

/**
 * Sequence of squares of BigIntegers.
 * @author emaphis
 */
public class SquareSequence implements Sequence<BigInteger> {
   private BigInteger i = new BigInteger(Integer.toString(1));

   @Override
   public boolean hasNext() {
      return true;
   }

   @Override
   public BigInteger next() {
      i = i.add(i);
      return i.multiply(i);
   }
   
}
