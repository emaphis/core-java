/*
 * Chapter 6 - Interfaces
 * Exercise 6
 */
package vol1.chap06.exercises;

/**
 * Sequence interface
 * @author emaphis
 * @param <T> type of sequence.
 */
public interface Sequence<T> {
   boolean hasNext();
   T next();
}
