/*
 * Chapter 8 - Generic Programming.
 * Section 2 - Simple generic class
 * Section 3 - 
 */
package vol1.chap08.sec02;

/**
 * Represents a generic pair of values
 * @author emaphis
 * @param <T> Type held by pair
 */
public class Pair<T> {
   private T first;
   private T second;

   public Pair() { first = null; second = null; }
   public Pair(T first, T second) { this.first = first; this.second = second; }

   public T getFirst() { return first; }
   public T getSecond() { return second; }

   public void setFirst(T first) { this.first = first; }
   public void setSecond(T second) { this.second = second; }
}
