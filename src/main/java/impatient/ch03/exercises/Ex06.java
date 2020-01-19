/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercise 6
 */
package impatient.ch03.exercises;

import java.math.BigInteger;
import vol1.chap06.exercises.Sequence;

/*
The SquareSequence class doesn’t actually deliver an infinite sequence of
squares due to integer overflow. Specifically, how does it behave? Fix the
problem by defining a Sequence<T> interface and a SquareSequence class that
implements Sequence<BigInteger>.
*/

// See SquareSequence.java
// and Sequence.java

public class Ex06 {

   public static void main(String[] args) {
      SquareSequece seq = new SquareSequece();
      for (int i = 0; i < 500 && seq.hasNext(); i++) {
         System.out.println(seq.next());
      }
   }

}
