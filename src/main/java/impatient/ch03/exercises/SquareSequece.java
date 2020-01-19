/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercise 6
 */
package impatient.ch03.exercises;

import java.math.BigInteger;

/*
The SquareSequence class doesn’t actually deliver an infinite sequence of
squares due to integer overflow. Specifically, how does it behave? Fix the
problem by defining a Sequence<T> interface and a SquareSequence class that
implements Sequence<BigInteger>.
*/

public class SquareSequece implements Sequence<BigInteger> {
   private BigInteger bigI = new BigInteger("0");

   @Override
   public BigInteger next() {
      BigInteger newI = bigI;
      bigI = bigI.add(BigInteger.ONE); // increment
      return newI.multiply(newI);
   }

}
