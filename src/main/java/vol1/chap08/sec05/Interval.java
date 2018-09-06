/*
 * Chapter 8 - Generics
 * Sec 5 - Type erasure.
 */
package vol1.chap08.sec05;

import java.io.Serializable;

/**
 * Experiment with Type Erasure
 * @author emaphis
 * @param <T> Type of generic class
 */
public class Interval<T extends Comparable & Serializable> implements Serializable{
   private final T lower;
   private final T upper;

   public Interval (T first, T second) {
      if (first.compareTo(second) <= 0) { lower = first; upper = second; }
      else { lower = second; upper = first; }
   }

   public T getLower() { return lower; }
   public T getUpper() { return upper; }
}
