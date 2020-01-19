/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;

/*
The SquareSequence class doesn’t actually deliver an infinite sequence of
squares due to integer overflow. Specifically, how does it behave? Fix the
problem by defining a Sequence<T> interface and a SquareSequence class that
implements Sequence<BigInteger>.
*/

public interface Sequence<T> {
   default boolean hasNext() { return true; }
   T next();
}
